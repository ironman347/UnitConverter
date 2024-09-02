package com.example.unitconverter.ui

import com.example.unitconverter.data.ConvertType
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class ConverterViewModelTest {
    val viewModel = ConverterViewModel()

    @Test
    fun fahrenheit_to_celsius_conversion() {
        viewModel.onEvent(ConverterEvent.ChangeFromType(ConvertType.FAHRENHEIT))
        viewModel.onEvent(ConverterEvent.ChangeToType(ConvertType.CELSIUS))


        viewModel.onEvent(ConverterEvent.EnterValue("32"))
        var result = viewModel._state.value.outputValue
        assertEquals("0.00 C", result)

        viewModel.onEvent(ConverterEvent.EnterValue("142"))
        result = viewModel._state.value.outputValue
        assertEquals("61.11 C", result)

        viewModel.onEvent(ConverterEvent.EnterValue("999"))
        result = viewModel._state.value.outputValue
        assertEquals("537.22 C", result)

        viewModel.onEvent(ConverterEvent.EnterValue("-1"))
        result = viewModel._state.value.outputValue
        assertEquals("-18.33 C", result)

        viewModel.onEvent(ConverterEvent.EnterValue("-999"))
        result = viewModel._state.value.outputValue
        assertEquals("-572.78 C", result)

        viewModel.onEvent(ConverterEvent.EnterValue("100000"))
        result = viewModel._state.value.outputValue
        assertEquals("55537.78 C", result)

        viewModel.onEvent(ConverterEvent.EnterValue(""))
        result = viewModel._state.value.outputValue
        assertEquals("Enter a Valid Number", result)

        viewModel.onEvent(ConverterEvent.EnterValue("test"
        ))
        result = viewModel._state.value.outputValue
        assertEquals("Enter a Valid Number", result)
    }

    @Test
    fun celsius_to_fahrenheit_conversion() {
        viewModel.onEvent(ConverterEvent.ChangeFromType(ConvertType.CELSIUS))
        viewModel.onEvent(ConverterEvent.ChangeToType(ConvertType.FAHRENHEIT))



        viewModel.onEvent(ConverterEvent.EnterValue("0"))
        var result = viewModel._state.value.outputValue
        assertEquals("32.00 F", result)

        viewModel.onEvent(ConverterEvent.EnterValue("142"))
        result = viewModel._state.value.outputValue
        assertEquals("287.60 F", result)

        viewModel.onEvent(ConverterEvent.EnterValue("999"))
        result = viewModel._state.value.outputValue
        assertEquals("1830.20 F", result)

        viewModel.onEvent(ConverterEvent.EnterValue("-1"))
        result = viewModel._state.value.outputValue
        assertEquals("30.20 F", result)

        viewModel.onEvent(ConverterEvent.EnterValue("-999"))
        result = viewModel._state.value.outputValue
        assertEquals("-1766.20 F", result)

        viewModel.onEvent(ConverterEvent.EnterValue("100000"))
        result = viewModel._state.value.outputValue
        assertEquals("180032.00 F", result)

        viewModel.onEvent(ConverterEvent.EnterValue(""))
        result = viewModel._state.value.outputValue
        assertEquals("Enter a Valid Number", result)

        viewModel.onEvent(ConverterEvent.EnterValue("test"
        ))
        result = viewModel._state.value.outputValue
        assertEquals("Enter a Valid Number", result)
    }

    @Test
    fun fahrenheit_to_kelvin_conversion() {
        viewModel.onEvent(ConverterEvent.ChangeFromType(ConvertType.FAHRENHEIT))
        viewModel.onEvent(ConverterEvent.ChangeToType(ConvertType.KELVIN))



        viewModel.onEvent(ConverterEvent.EnterValue("0"))
        var result = viewModel._state.value.outputValue
        assertEquals("255.37 K", result)

        viewModel.onEvent(ConverterEvent.EnterValue("142"))
        result = viewModel._state.value.outputValue
        assertEquals("334.26 K", result)

        viewModel.onEvent(ConverterEvent.EnterValue("999"))
        result = viewModel._state.value.outputValue
        assertEquals("810.37 K", result)

        viewModel.onEvent(ConverterEvent.EnterValue("-1"))
        result = viewModel._state.value.outputValue
        assertEquals("254.82 K", result)

        viewModel.onEvent(ConverterEvent.EnterValue("-999"))
        result = viewModel._state.value.outputValue
        assertEquals("-299.63 K", result)

        viewModel.onEvent(ConverterEvent.EnterValue("100000"))
        result = viewModel._state.value.outputValue
        assertEquals("55810.93 K", result)

        viewModel.onEvent(ConverterEvent.EnterValue(""))
        result = viewModel._state.value.outputValue
        assertEquals("Enter a Valid Number", result)

        viewModel.onEvent(ConverterEvent.EnterValue("test"
        ))
        result = viewModel._state.value.outputValue
        assertEquals("Enter a Valid Number", result)
    }

    @Test
    fun kelvin_to_fahrenheit_conversion() {
        viewModel.onEvent(ConverterEvent.ChangeFromType(ConvertType.KELVIN))
        viewModel.onEvent(ConverterEvent.ChangeToType(ConvertType.FAHRENHEIT))



        viewModel.onEvent(ConverterEvent.EnterValue("0"))
        var result = viewModel._state.value.outputValue
        assertEquals("-459.67 F", result)

        viewModel.onEvent(ConverterEvent.EnterValue("142"))
        result = viewModel._state.value.outputValue
        assertEquals("-204.07 F", result)

        viewModel.onEvent(ConverterEvent.EnterValue("999"))
        result = viewModel._state.value.outputValue
        assertEquals("1338.53 F", result)

        viewModel.onEvent(ConverterEvent.EnterValue("-1"))
        result = viewModel._state.value.outputValue
        assertEquals("-461.47 F", result)

        viewModel.onEvent(ConverterEvent.EnterValue("-999"))
        result = viewModel._state.value.outputValue
        assertEquals("-2257.87 F", result)

        viewModel.onEvent(ConverterEvent.EnterValue("100000"))
        result = viewModel._state.value.outputValue
        assertEquals("179540.33 F", result)

        viewModel.onEvent(ConverterEvent.EnterValue(""))
        result = viewModel._state.value.outputValue
        assertEquals("Enter a Valid Number", result)

        viewModel.onEvent(ConverterEvent.EnterValue("test"
        ))
        result = viewModel._state.value.outputValue
        assertEquals("Enter a Valid Number", result)
    }

    @Test
    fun kelvin_to_celsius_conversion() {
        viewModel.onEvent(ConverterEvent.ChangeFromType(ConvertType.KELVIN))
        viewModel.onEvent(ConverterEvent.ChangeToType(ConvertType.CELSIUS))

        viewModel.onEvent(ConverterEvent.EnterValue("0"))
        var result = viewModel._state.value.outputValue
        assertEquals("-273.15 C", result)

        viewModel.onEvent(ConverterEvent.EnterValue("142"))
        result = viewModel._state.value.outputValue
        assertEquals("-131.15 C", result)

        viewModel.onEvent(ConverterEvent.EnterValue("999"))
        result = viewModel._state.value.outputValue
        assertEquals("725.85 C", result)

        viewModel.onEvent(ConverterEvent.EnterValue("-1"))
        result = viewModel._state.value.outputValue
        assertEquals("-274.15 C", result)

        viewModel.onEvent(ConverterEvent.EnterValue("-999"))
        result = viewModel._state.value.outputValue
        assertEquals("-1272.15 C", result)

        viewModel.onEvent(ConverterEvent.EnterValue("100000"))
        result = viewModel._state.value.outputValue
        assertEquals("99726.85 C", result)

        viewModel.onEvent(ConverterEvent.EnterValue(""))
        result = viewModel._state.value.outputValue
        assertEquals("Enter a Valid Number", result)

        viewModel.onEvent(ConverterEvent.EnterValue("test"
        ))
        result = viewModel._state.value.outputValue
        assertEquals("Enter a Valid Number", result)
    }

    @Test
    fun celsius_to_kelvin_conversion() {
        viewModel.onEvent(ConverterEvent.ChangeFromType(ConvertType.CELSIUS))
        viewModel.onEvent(ConverterEvent.ChangeToType(ConvertType.KELVIN))

        viewModel.onEvent(ConverterEvent.EnterValue("0"))
        var result = viewModel._state.value.outputValue
        assertEquals("273.15 K", result)

        viewModel.onEvent(ConverterEvent.EnterValue("142"))
        result = viewModel._state.value.outputValue
        assertEquals("415.15 K", result)

        viewModel.onEvent(ConverterEvent.EnterValue("999"))
        result = viewModel._state.value.outputValue
        assertEquals("1272.15 K", result)

        viewModel.onEvent(ConverterEvent.EnterValue("-1"))
        result = viewModel._state.value.outputValue
        assertEquals("272.15 K", result)

        viewModel.onEvent(ConverterEvent.EnterValue("-999"))
        result = viewModel._state.value.outputValue
        assertEquals("-725.85 K", result)

        viewModel.onEvent(ConverterEvent.EnterValue("100000"))
        result = viewModel._state.value.outputValue
        assertEquals("100273.15 K", result)

        viewModel.onEvent(ConverterEvent.EnterValue(""))
        result = viewModel._state.value.outputValue
        assertEquals("Enter a Valid Number", result)

        viewModel.onEvent(ConverterEvent.EnterValue("test"
        ))
        result = viewModel._state.value.outputValue
        assertEquals("Enter a Valid Number", result)
    }

    @Test
    fun celsius_to_celsius_conversion() {
        viewModel.onEvent(ConverterEvent.ChangeFromType(ConvertType.CELSIUS))
        viewModel.onEvent(ConverterEvent.ChangeToType(ConvertType.CELSIUS))

        viewModel.onEvent(ConverterEvent.EnterValue("0"))
        var result = viewModel._state.value.outputValue
        assertEquals("0.00 C", result)

        viewModel.onEvent(ConverterEvent.EnterValue("142"))
        result = viewModel._state.value.outputValue
        assertEquals("142.00 C", result)

        viewModel.onEvent(ConverterEvent.EnterValue("999"))
        result = viewModel._state.value.outputValue
        assertEquals("999.00 C", result)

        viewModel.onEvent(ConverterEvent.EnterValue("-1"))
        result = viewModel._state.value.outputValue
        assertEquals("-1.00 C", result)

        viewModel.onEvent(ConverterEvent.EnterValue("-999"))
        result = viewModel._state.value.outputValue
        assertEquals("-999.00 C", result)

        viewModel.onEvent(ConverterEvent.EnterValue("100000"))
        result = viewModel._state.value.outputValue
        assertEquals("100000.00 C", result)

        viewModel.onEvent(ConverterEvent.EnterValue(""))
        result = viewModel._state.value.outputValue
        assertEquals("Enter a Valid Number", result)

        viewModel.onEvent(ConverterEvent.EnterValue("test"
        ))
        result = viewModel._state.value.outputValue
        assertEquals("Enter a Valid Number", result)
    }

    @Test
    fun fahrenheit_to_fahrenheit_conversion() {
        viewModel.onEvent(ConverterEvent.ChangeFromType(ConvertType.FAHRENHEIT))
        viewModel.onEvent(ConverterEvent.ChangeToType(ConvertType.FAHRENHEIT))

        viewModel.onEvent(ConverterEvent.EnterValue("0"))
        var result = viewModel._state.value.outputValue
        assertEquals("0.00 F", result)

        viewModel.onEvent(ConverterEvent.EnterValue("142"))
        result = viewModel._state.value.outputValue
        assertEquals("142.00 F", result)

        viewModel.onEvent(ConverterEvent.EnterValue("999"))
        result = viewModel._state.value.outputValue
        assertEquals("999.00 F", result)

        viewModel.onEvent(ConverterEvent.EnterValue("-1"))
        result = viewModel._state.value.outputValue
        assertEquals("-1.00 F", result)

        viewModel.onEvent(ConverterEvent.EnterValue("-999"))
        result = viewModel._state.value.outputValue
        assertEquals("-999.00 F", result)

        viewModel.onEvent(ConverterEvent.EnterValue("100000"))
        result = viewModel._state.value.outputValue
        assertEquals("100000.00 F", result)

        viewModel.onEvent(ConverterEvent.EnterValue(""))
        result = viewModel._state.value.outputValue
        assertEquals("Enter a Valid Number", result)

        viewModel.onEvent(ConverterEvent.EnterValue("test"
        ))
        result = viewModel._state.value.outputValue
        assertEquals("Enter a Valid Number", result)
    }

    @Test
    fun kelvin_to_kelvin_conversion() {
        viewModel.onEvent(ConverterEvent.ChangeFromType(ConvertType.KELVIN))
        viewModel.onEvent(ConverterEvent.ChangeToType(ConvertType.KELVIN))

        viewModel.onEvent(ConverterEvent.EnterValue("0"))
        var result = viewModel._state.value.outputValue
        assertEquals("0.00 K", result)

        viewModel.onEvent(ConverterEvent.EnterValue("142"))
        result = viewModel._state.value.outputValue
        assertEquals("142.00 K", result)

        viewModel.onEvent(ConverterEvent.EnterValue("999"))
        result = viewModel._state.value.outputValue
        assertEquals("999.00 K", result)

        viewModel.onEvent(ConverterEvent.EnterValue("-1"))
        result = viewModel._state.value.outputValue
        assertEquals("-1.00 K", result)

        viewModel.onEvent(ConverterEvent.EnterValue("-999"))
        result = viewModel._state.value.outputValue
        assertEquals("-999.00 K", result)

        viewModel.onEvent(ConverterEvent.EnterValue("100000"))
        result = viewModel._state.value.outputValue
        assertEquals("100000.00 K", result)

        viewModel.onEvent(ConverterEvent.EnterValue(""))
        result = viewModel._state.value.outputValue
        assertEquals("Enter a Valid Number", result)

        viewModel.onEvent(ConverterEvent.EnterValue("test"
        ))
        result = viewModel._state.value.outputValue
        assertEquals("Enter a Valid Number", result)
    }
}