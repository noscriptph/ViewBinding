package com.noscript.viewbinding

import AppPermissions
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.os.VibrationEffect
import android.os.VibratorManager
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.noscript.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var vibratorManager: VibratorManager
    private lateinit var binding: ActivityMainBinding
    private lateinit var permissions: AppPermissions // Cambiado de AppPermission a AppPermissions
    // aquí crearé las variables de usuario y contraseña
    private var usuario = "user"
    private var contrasenia = "1234"


    @RequiresApi(Build.VERSION_CODES.S)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        permissions = AppPermissions() // Cambiado de AppPermission a AppPermissions
        binding = ActivityMainBinding.inflate(layoutInflater)
        setInitComponent()
        setListener()

        vibratorManager = getSystemService(Context.VIBRATOR_MANAGER_SERVICE) as VibratorManager


        if (permissions.isLocationOk(this)) {
            println("Allowed")
        } else {
            println("Not Allowed")
            permissions.requestLocationPermission(this)
        }
    }

    private fun setInitComponent() {
        binding.txtTitleApp.setText(R.string.app_name)
        setContentView(binding.root)
    }

    @RequiresApi(Build.VERSION_CODES.S)
    private fun setListener() {





        binding.btn1.setOnClickListener { inicioSesion() }

        binding.cuadroContrase.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE || actionId == EditorInfo.IME_NULL) {
                inicioSesion()
                true
            } else {
                false
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.S)
    private fun inicioSesion() {
        // Vibrate the device
        val vibrator = vibratorManager.defaultVibrator
        vibrator.vibrate(VibrationEffect.createOneShot(80,50))
        // Esto para leer lo que dicen los cuadroTexto1 y cuadroContrase
        val usuarioIngresado = binding.cuadroTexto1.text.toString()
        val contraseniaIngresada = binding.cuadroContrase.text.toString()

        // Comparamos las credenciales ingresadas con las credenciales guardadas usando equals
        if (usuarioIngresado.equals(usuario) && contraseniaIngresada.equals(contrasenia)) {
            Toast.makeText(this, "Usuario y contraseña válidos", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "Usuario y contraseña no válidos", Toast.LENGTH_LONG).show()
        }
    }
}
