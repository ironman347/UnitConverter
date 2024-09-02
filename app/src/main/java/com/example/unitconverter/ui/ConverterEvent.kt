package com.example.unitconverter.ui

import com.example.unitconverter.data.ConvertType

sealed interface ConverterEvent {
    data class ChangeFromType(val newType: ConvertType) : ConverterEvent
    data class ChangeToType(val newType: ConvertType) : ConverterEvent
    data class EnterValue(val newValue: String) : ConverterEvent
}