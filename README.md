#################################### Notas ####################################

Acceso a recursos desde java:

Resources res = getResources();
Drawable drawable = ContextCompat.getDrawable(R.drawable.asteroide); 
String saludo = res.getString(R.string.saludo);
int color = ContextCompat.getColor(R.color.verde_opaco);
float tamanoFuente = res.getDimension(R.dimen.tamano_fuente);
int maxAsteroides = res.getInteger(R.integer.max_asteroides);
boolean ilimitados = res.getBoolean(R.bool.misiles_ilimitados);
String[] diasSemana = res.getStringArray(R.array.dias_semana);
int[] primos = res.getIntArray(R.array.primos);
TypedArray asteroides = res.obtainTypedArray(R.array.asteroides); 
Drawable asteroide1 = asteroides.getDrawable(0); 
..

