package com.example.usuario.notengotiempo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

/**
 *  La aplicación permitirá ver, añadir, modificar y eliminar tareas.

 También se podrá hacer una copia de seguridad de las tareas existentes en el servidor. La copia contendrá los datos de todas las tareas en formato json y se enviará por email a un destinatario dado.

 Crear un API RESTful que permita manejar toda la información usada.

 La aplicación se comunicará con un API REST situada en un servidor LAMP o LEMP en un alojamiento propio en Internet (en un VPS o en un hosting compartido).

 Se utilizará el framework Laravel, la información se guardará en una base de datos MySQL y se accederá por https.

 Se creará un repositorio privado del trabajo (en Bitbucket o en Gitlab) y se pondrá en el fichero readme.md la documentación del ejercicio (planteamiento, configuración necesaria, mejoras, etc).

 En el repositorio se incluirá el fichero comprimido laravel.zip con todo el código necesario en el servidor y el script tareas.sql para crear la base de datos usada.

 Se enviará el archivo llamado primerapellido_nombre_tareas.txt (sustituyendo cada uno el apellido y nombre por el suyo propio) con la dirección del repositorio.
 */
