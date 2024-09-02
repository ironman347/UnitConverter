package com.example.unitconverter.ui

import com.example.unitconverter.data.ConvertType
import kotlinx.coroutines.flow.MutableStateFlow
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.update

class ConverterViewModel : ViewModel() {

    val _state = MutableStateFlow(ConverterState())


    fun onEvent(event: ConverterEvent) {
        when (event) {
            is ConverterEvent.EnterValue -> {
                _state.update {
                    it.copy(
                        inputValue = event.newValue,
                        outputValue = convert(event.newValue)
                    )
                }
            }

            is ConverterEvent.ChangeFromType -> {
                _state.update {
                    it.copy(
                        convertFrom = event.newType
                    )
                }

            }

            is ConverterEvent.ChangeToType -> {
                _state.update {
                    it.copy(
                        convertTo = event.newType
                    )
                }

            }
        }
    }

    fun convert(initialValue: String): String {
        try {
            val input = initialValue.toDouble()

            if (_state.value.convertTo == ConvertType.CELSIUS && _state.value.convertFrom == ConvertType.FAHRENHEIT) {
                return String.format("%.2f C",((input - 32.0) * 5.0 / 9.0))
            }

            else if (_state.value.convertTo == ConvertType.KELVIN && _state.value.convertFrom == ConvertType.FAHRENHEIT) {
                return String.format("%.2f K",(((input - 32.0) * 5.0 / 9.0) + 273.15))
            }

            else if (_state.value.convertTo == ConvertType.FAHRENHEIT && _state.value.convertFrom == ConvertType.CELSIUS) {
                return String.format("%.2f F",((input * 9.0 / 5.0) + 32))
            }

            else if (_state.value.convertTo == ConvertType.KELVIN && _state.value.convertFrom == ConvertType.CELSIUS) {
                return String.format("%.2f K",(input + 273.15))
            }

            else if (_state.value.convertTo == ConvertType.CELSIUS && _state.value.convertFrom == ConvertType.KELVIN) {
                return String.format("%.2f C",(input - 273.15))
            }

            else if (_state.value.convertTo == ConvertType.FAHRENHEIT && _state.value.convertFrom == ConvertType.KELVIN) {
                return String.format("%.2f F", (((input - 273.15) * 9.0 / 5.0) + 32.0))
            }
            else if (_state.value.convertTo == ConvertType.FAHRENHEIT && _state.value.convertFrom == ConvertType.FAHRENHEIT) {
                return String.format("%.2f F", (input))
            }
            else if (_state.value.convertTo == ConvertType.KELVIN && _state.value.convertFrom == ConvertType.KELVIN) {
                return String.format("%.2f K", (input))
            }
            else if (_state.value.convertTo == ConvertType.CELSIUS && _state.value.convertFrom == ConvertType.CELSIUS) {
                return String.format("%.2f C", (input))
            }
            else {
                return ("Enter a Valid Number")
            }

        } catch (e: Exception) {
            return ("Enter a Valid Number")
        }
    }
}