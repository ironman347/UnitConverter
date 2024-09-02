package com.example.unitconverter.ui

import com.example.unitconverter.data.ConvertType

data class ConverterState (
    val convertTo: ConvertType = ConvertType.FAHRENHEIT,
    val convertFrom: ConvertType = ConvertType.CELSIUS,
    val inputValue: String = "",
    val outputValue: String = ""
)