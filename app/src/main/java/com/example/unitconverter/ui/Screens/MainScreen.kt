package com.example.unitconverter.ui.Screens

import androidx.annotation.StringRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.FlowColumnScopeInstance.align
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.unitconverter.R
import com.example.unitconverter.data.ConvertType
import com.example.unitconverter.ui.ConverterEvent
import com.example.unitconverter.ui.ConverterState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    state: ConverterState,
    onEvent: (ConverterEvent) -> Unit,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                ),
                title = {
                    Text(text = "Unit Converter")
                }
            )
        },
        modifier = Modifier.fillMaxSize()
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Text(
            text ="Convert From: "
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(1.dp)
                    .scale(.6f),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                ConvertType.values().forEach { convertType ->
                    Row(
                        modifier = Modifier
                            .clickable {
                                onEvent(ConverterEvent.ChangeFromType(convertType))
                            },
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(
                            selected = convertType == state.convertFrom,
                            onClick = {
                                onEvent(ConverterEvent.ChangeFromType(convertType))
                            }
                        )
                        Text(
                            text = convertType.name,
                            modifier = Modifier.padding(start = 8.dp)
                        )
                    }
                }

            }
            Text(
                text ="Convert To: "
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(1.dp)
                    .scale(.6f),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                ConvertType.values().forEach { convertType ->
                    Row(
                        modifier = Modifier
                            .clickable {
                                onEvent(ConverterEvent.ChangeToType(convertType))
                            },
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(
                            selected = convertType == state.convertTo,
                            onClick = {
                                onEvent(ConverterEvent.ChangeToType(convertType))
                            }
                        )
                        Text(
                            text = convertType.name,
                            modifier = Modifier.padding(start = 8.dp)
                        )
                    }
                }

            }
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(0.dp),
                horizontalArrangement = Arrangement.Start,
                //verticalAlignment = Alignment.CenterVertically
            ) {
                    TextField(
                        value = state.inputValue,
                        onValueChange = { it: String ->
                            onEvent(ConverterEvent.EnterValue(it))
                        },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        maxLines = 1,
                        modifier = Modifier
                            .padding(4.dp)
                            .weight(1f)
                    )
                    Box(
                        modifier = Modifier
                            .weight(.3f)
                            .padding(top = 22.dp)
                    ) {
                        Text(
                            text = "=",
                            modifier = Modifier
                                .align(Alignment.Center)
                                .scale(2f)
                        )
                    }
                    TextField(
                        value = state.outputValue,
                        enabled = false,
                        onValueChange = { it: String ->
                            //onEvent(ConverterEvent.EnterValue(it))
                        },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                        maxLines = 1,
                        modifier = Modifier
                            .padding(4.dp)
                            .weight(1f)
                    )
//                    Text(
//                        text = state.outputValue,
//                        modifier = Modifier
//                            .padding(4.dp)
//                            .weight(1f)
//                    )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ConverterScreenPreview() {
    MainScreen( state = ConverterState(), onEvent = {}, )
}
