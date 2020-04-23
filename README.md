# AndroidStart_am7z4erpi9

##########   notas   ##########   

Tipos de recursos
Según la carpeta que utilicemos el recurso creado será de un tipo específico. Pasamos a enumerar las carpetas y tipos posibles: 

Carpeta
identificador

Descripción

res/drawable/
R.drawable

Ficheros en bitmap (.png, .jpg o .gif). Ficheros PNG en formato Nine-patch (.9.png). Ficheros XML con descriptores gráficos (ver clase Drawable)

res/mipmap/
R.mipmap	Ficheros en bitmap (.png, .jpg o .gif). Estos gráficos no son rescaldados para adaptarlos a la densidad gráfica del dispositivo, sino que se buscará en las subcarpetas el gráfico con la densidad más parecida y se utilizará directamente.
res/layout/
R.layout

Ficheros XML con los Layouts usados en la aplicación.

res/menu/
R.menu

Ficheros XML con la definición de menús. Podemos asignar una actividad o una vista.

res/anim/
R.anim

Fichero XML que permiten definir una animaciones Tween también conocidas como animaciones de vista.

res/animator
R.animator

Ficheros XML que permiten modificar las propiedades de un objeto a lo largo del tiempo. (Véase apartado "Animación de propiedades"). Solo desde la versión 3.0.

res/xml/
R.xml

Otros ficheros XML, como los ficheros de preferencias

res/raw/
R.raw

Ficheros que se encuentran en formato binario. Por ejemplo ficheros de audio o vídeo.

res/values/

Ficheros XML que definen un determinado valor para definir un color, estilo, cadena de caracteres, etc. Se describen en la siguiente tabla.

Tabla: Tipos de recursos según carpeta en Android.

Veamos los tipos de recursos que encontramos dentro de la carpeta values:

Fichero por defecto
identificador

Descripción

strings.xml
R.string

Identifica cadenas de caracteres

<string name="saludo">¡Hola Mundo!</string>

colors.xml
R.color

Un color definido en formato ARGB (alfa, rojo, verde y azul). Los valores se indican en hexadecimal en uno de los siguientes formatos: #RGB, #ARGB, #RRGGBB ó #AARRGGBB

<color name="verde_opaco">#0f0</color>
<color name="red_translucido">#80ff0000</color>

dimensions.xml
R.dimen

Un número seguido de una unidad de medida.

px - pixeles, mm - milímetros, in – pulgadas, pt – puntos (=1/72 pulgadas), dp – píxeles independientes de la densidad (=1/160 pulgadas), sp – igual que dp pero cambia según las preferencias de tamaño de fuente.

<dimen name="alto">2.2mm</dimen>
<dimen name="tamano_fuente">16sp</dimen>

styles.xml
R.style

Definen una serie de atributos que pueden ser aplicados a una vista o a una actividad. Si se aplican a una actividad se conocen como temas.

<style name="TextoGrande" parent="@style/Text">          
   <item name="android:textSize">20pt</item>       
   <item name="android:textColor">#000080</item>    </style>

R.int

Define un valor entero.

<integer name="max_asteroides">5</integer>

R.bool

Define un valor booleano.

<bool name="misiles_ilimitados">true</bool>

R.id

Define un recurso de id único. La forma habitual de asignar id a los recursos es utilizando el atributo id="@+id/nombre". Aunque en algunos casos puede ser interesante disponer de id previamente creado, para que los elementos así nombrados tengan una determinada función. Este tipo de id se utiliza en las vistas TabHost y ListView.

<item type="id" name="button_ok"/>
<item type="id" name="dialog_exit"/>

R.array

Una serie ordenada de elementos. Pueden ser de strings, de enteros o de recursos (TypedArray)

<string-array name="dias_semana">                    <      <item>lunes</item>
       <item>martes</item>
</string-array>

<integer-array name="primos">
       <item>2</item><item>3</item><item>5</item>
</integer-array>
<array name="asteroides">                             <item>@drawable/asteroide1</item>             <item>@drawable/asteroide2</item>
</array>

