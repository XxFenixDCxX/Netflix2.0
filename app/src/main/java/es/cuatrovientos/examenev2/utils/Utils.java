package es.cuatrovientos.examenev2.utils;

import java.util.ArrayList;

import es.cuatrovientos.examenev2.R;
import es.cuatrovientos.examenev2.models.Film;

public class Utils {
    public static ArrayList<Film> getDummyData() {
        ArrayList filmList = new ArrayList();

        filmList.add(new Film("Arcane","'Arcane' ahonda en el precario equilibrio entre la rica ciudad de Piltover y la sórdida y oprimida Zaun. La tensión entre ambas ciudades-estado se exacerba, por un lado, debido a la creación en Piltover de algo llamado \"Hextech\", que permite a cualquiera controlar la energía mágica, y, por otro, de una nueva droga en Zaun llamada \"Shimmer\", que transforma a los humanos en monstruos. La rivalidad entre las dos ciudades divide a las familias y los amigos. 'Arcane' da vida a las relaciones que moldean a algunos de los famosos campeones de ‘League of Legends’, como Vi, Jinx, Caitlyn, Jayce y Viktor.","Christian Linke","Hailee Steinfeld, Mia Sinclair Jenness, JB Blanc, Jason Spisak, Kevin Alejandro", R.drawable.arcane,R.drawable.arcane_detail, false, true, false));
        filmList.add(new Film("Lupin", "Versión contemporánea del clásico francés, Assane Diop (Omar Sy) es un escurridizo ladrón de guante blanco y aficionado a las aventuras de Arsene Lupin que busca vengar la muerte de su padre a causa del poderoso patriarca de una rica familia. Años después de una trágica injusticia, Assane se propone ajustar cuentas -y una deuda- robando un collar de diamantes, pero las cosas no salen según lo previsto.","George Kay","Omar Sy, Ludivine Sagnier, Nicole García, Hervé Pierre,Vincent Londez",R.drawable.arsene_lupin,R.drawable.arsene_lupin_detail,true,false,false));
        filmList.add(new Film("Big Mouth","Nick Kroll y Andrew Goldberg, amigos íntimos en la vida real, exploran las aventuras de los adolescentes durante la pubertad en esta serie cómica de dibujos animados.","Nick Kroll","Nick Kroll, John Mulaney, Jaon Mantzoukas, Jessi Klein",R.drawable.big_mouth,R.drawable.big_mouth_detail,false,true,false));
        filmList.add(new Film("Black Mirror", "Serie antológica creada por Charlie Brooker (\"Dead Set\") que muestra el lado oscuro de la tecnología y cómo esta afecta y puede alterar nuestra vida, a veces con consecuencias tan impredecibles como aterradoras. \"Black Mirror\" comenzó su emisión en 2011 en el canal británico Channel 4, con dos temporadas de tres episodios cada una, y tras producirse un especial de Navidad la serie fue comprada y renovada por Netflix, que ya ha producido tres temporadas más.","Charlie Brooker","Rory Kinnear, Lindsay Duncan, Lydia Wilson, Tom Goodman-Hill, Donald Sumpter, Allen Leech, Anna Wilson-Jones, Sophie Kennedy Clark, Jay Simpson, Daniel Kaluuya", R.drawable.black_mirror,R.drawable.black_mirror_detail,false,false,true));
        filmList.add(new Film("Desencando", "\"(Des)encanto\" narra las desventuras de Bean, una princesa aficionada a la bebida en el mundo medieval en ruinas de Dreamland. Ahí viaja acompañada por Elfo, su enérgico acompañante, y Luci, su demonio personal. En el camino, este trío disfuncional se encontrará con ogros, arpías, trolls, duendecillos, diabillos, morsas y muchos humanos tontos.","Matt Groening","Animación",R.drawable.disenchantment,R.drawable.disenchantment_detail,true,true,false));
        filmList.add(new Film("No mires arriba","Kate Dibiasky (Jennifer Lawrence), estudiante de posgrado de Astronomía, y su profesor, el doctor Randall Mindy (Leonardo DiCaprio) hacen un descubrimiento tan asombros como terrorífico: un enorme cometa lleva un rumbo de colisión directa con la Tierra. El otro problema es... que a nadie le importa. Kate y Randall emprenden una gira mediática advertir a la humanidad que los lleva desde la indiferente presidenta Orlean (Meryl Streep) y su hijo y jefe de gabinete, Jason (Jonah Hill), a la emisión de 'The Daily Rip', un animado programa matinal presentado por Brie (Cate Blanchett) y Jack (Tyler Perry). Solo quedan seis meses para el impacto del cometa, pero gestionar el flujo de noticias y ganarse la atención de un público obsesionado con las redes sociales antes de que sea demasiado tarde resulta sorprendentemente cómico. ¿Pero qué es lo que hay que hacer para que el mundo mire hacia arriba?","Adam McKay","Leonardo DiCaprio, Jennifer Lawrence,Meryl Streep, Cate Blanchett, Jonah Hill, Rob Morgan",R.drawable.don_t_look_up,R.drawable.don_t_look_up_detail,false,true,true));
        filmList.add(new Film("Cazafantasmas: Más allá","Una madre soltera y sus dos hijos llegan a una pequeña ciudad, descubriendo su conexión con los cazafantasmas originales y el legado secreto que dejó su abuelo tras de sí. Secuela directa de \"Cazafantasmas 2\".","Jason Reitman","Mckenna Grace, Logan Kim, Finn Wolfhard, Carrie Coon, Paul Rudd, Celeste O'Connor", R.drawable.ghostbusters_afterlife,R.drawable.ghostbusters_afterlife_detail,false,false,true));
        filmList.add(new Film("Puñales por la espalda: El misterio de Glass Onion","Cuando el multimillonario Miles Bron (Edward Norton) invita a algunos de sus allegados a una escapada a su isla griega privada, pronto queda claro que no todo es perfecto en el paraíso. Y cuando alguien aparece muerto, ¿quién mejor que Benoit Blanc para desentrañar todas las capas del misterio?","Rian Johnson","Daniel Craig, Edward Norton, Janelle Monáe, Kathryn Hahn, Leslie Odom Jr., Jessica Henwick",R.drawable.glass_onion,R.drawable.glass_onion_detail,true, true, false));
        filmList.add(new Film("Sin novedad en el frente", "Relato de las terribles experiencias y la angustia de un joven soldado alemán en el frente occidental durante la Primera Guerra Mundial.", "Edward Berger", "Felix Kammerer, Albrecht Schuch, Aaron Hilmer, Moritz Klaus, Edin Hasanovic, Daniel Brühl",R.drawable.im_westen_nichts_neues,R.drawable.im_westen_nichts_neues_detail,true,false,false));
        filmList.add(new Film("La casa de papel", "Un misterioso personaje, que se hace llamar \"El Profesor\", planea el mayor de los atracos jamás ideado. Para llevar a cabo el ambicioso plan, recluta a una banda formada por personas con ciertas cualidades y algo en común: no tienen nada que perder. El objetivo es atracar la Fábrica Nacional de Moneda y Timbre, con la intención de quedarse encerrados dentro con una misión muy concreta: no robar dinero, sino crearlo. Tras cinco meses de reclusión, memorizando cada paso, cada detalle, cada probabilidad..., por fin llega el día. Les esperan once días de encierro en la Fábrica de Moneda, rodeados de los cuerpos de élite de la policía y con 67 rehenes en su poder.","Álex Pina", "Álvaro Morte, Úrsula Corberó, Itziar Ituño, Alba Flores, Paco Tous, Najwa Nimri", R.drawable.la_casa_de_papel,  R.drawable.la_casa_de_papel_detail, false,true,true));
        filmList.add(new Film("La chica de nieve", "Málaga, 2010, cabalgata de los Reyes Magos. El momento más mágico del año se torna en pesadilla para la familia Martín cuando su hija Amaya desaparece entre la multitud. Miren (Milena Smit), una joven periodista en prácticas, comienza entonces una investigación paralela a la de la inspectora Millán (Aixa Villagrán), que despertará un suceso de su pasado que habría deseado olvidar. Con la ayuda de un colega periodista, Eduardo (Jose Coronado), Miren se empeñará en encontrar a la niña.","Jesús Mesas Silva","Milena Smit, José Coronado, Aixa Villagrán, Loreto Mauleón, Raúl Prieto, Tristán Ulloa", R.drawable.la_chica_de_nieve,R.drawable.la_chica_de_nieve_detail,false,true, true));
        filmList.add(new Film("Los renglones torcidos de Dios","Alice, investigadora privada, ingresa en un hospital psiquiátrico simulando una paranoia. Su objetivo es recabar pruebas del caso en el que trabaja: la muerte de un interno en circunstancias poco claras. Sin embargo, la realidad a la que se enfrentará en su encierro superará sus expectativas y pondrá en duda su propia cordura. Un mundo desconocido y apasionante se mostrará ante sus ojos. Adaptación de la novela homónima de Torcuato Luca de Tena.","Oriol Paulo", "Bárbara Lennie, Eduard Fernández, Loreto Mauleón, Pablo Derqui, Javier Beltrán, Samuel Soler", R.drawable.los_renglones_torcidos_de_dios,R.drawable.los_renglones_torcidos_de_dios_detail, true,false,false));
        filmList.add(new Film("La asistenta", "Una madre soltera hace trabajos domésticos para llegar a fin de mes mientras lucha contra la indigencia y la burocracia.", "Molly Smith Metzler","Margaret Qualley, Andie MacDowell, Billy Burke, Nick Robinson, Anika Noni Rose, Théodore Pellerin",R.drawable.maid,R.drawable.maid_detail,false,false,true));
        filmList.add(new Film("Pinocho de Guillermo del Toro","Versión musical en animación stop motion del famoso cuento de 'Pinocho', ambientada en la Italia fascista, durante la década de 1930. Guillermo del Toro y Mark Gustafson dirigen esta película, que en la versión original cuenta con un reparto estelar de voces: Ewan McGregor (Pepito Grillo), David Bradley (Geppetto) y el debutante Gregory Mann (Pinocho). También participan Finn Wolfhard, Cate Blanchett, John Turturro, Ron Perlman, Tim Blake Nelson, Burn Gorman, Christoph Waltz y Tilda Swinton." ,"Guillermo del Toro", "Ewan McGregor, David Bradley, Gregory Mann, Finn Wolfhard, Cate Blanchett,John Turturro", R.drawable.pinocchio,R.drawable.pinocchio_detail, true, true, false));
        filmList.add(new Film("Cortar por la línea de puntos", "Zero, un escritor y artista de cómics que se imagina a su subconsciente como un armadillo, recuerda cómo conoció a su amiga Alice cuando tenían 17 años. En 2023 se estrenó una continuación para Netflix en junio de 2023, titulada \"Este mundo no me hará mala persona\"","Zerocalcare","Valerio Mastandrea, Zerocalcare", R.drawable.strappare,R.drawable.strappare_detail,false,false,true));
        filmList.add(new Film("The Crown", "asada en la exitosa obra de teatro de Peter Morgan, 'The Audience', cuenta la historia de la última reina de Inglaterra, Isabel II, y de la relación entre dos de las direcciones más famosas del mundo: el Palacio de Buckingham y el número 10 de Downing Street, con las intrigas, amores y maquinaciones detrás de los eventos que forjaron la segunda mitad del siglo XX. Dos casas, dos cortes, una corona. Cada temporada trata las rivalidades políticas e intrigas personales durante una década del reinado de Isabel II y explora el delicado equilibrio entre su vida privada y la vida pública.", "Peter Morgan", "Claire Foy, Olivia Colman, Imelda Staunton Imelda Staunton, Matt Smith, John Lithgow, Vanessa Kirby", R.drawable.the_crown,R.drawable.the_crown_detail, false, true, true));
        filmList.add(new Film("El ángel de la muerte","Charlie Cullen es un enfermero considerado uno de los asesinos en serie más prolíficos de la historia. Bajo el apodo \"Ángel de la Muerte\", Cullen era un padre y marido que se ganaba la vida como cuidador. Su secreta afición de arrebatar vidas le llevó a estar implicado en la muerte de hasta 300 personas, repartidas entre nueve hospitales de las ciudades de Nueva Jersey y Pensilvania a lo largo de 16 años.","Tobias Lindholm", "Jessica Chastain, Eddie Redmayne, Nnamdi Asomugha, Kim Dickens, Noah Emmerich, Ajay Naidu", R.drawable.the_crown, R.drawable.the_crown_detail, false, true, true));
        filmList.add(new Film("El poder del perro", "Montana, 1925. Los acaudalados hermanos Phil (Cumberbatch) y George Burbank (Plemons) son las dos caras de la misma moneda. Phil es impetuoso y cruel, mientras George es impasible y amable. Juntos son copropietarios de un enorme rancho donde tienen ganado. Cuando George se casa con una viuda del pueblo, Rose (Dunst), Phil comienza a despreciar a su nueva cuñada, que se instala en el rancho junto a su hijo, el sensible Peter (Smit-McPhee).", "Jane Campion", "Benedict Cumberbatch, Jesse Plemons, Kirsten Dunst, Kodi Smit-McPhee, Thomasin McKenzie, Frances Conroy", R.drawable.the_power_of_the_dog, R.drawable.the_power_of_the_dog_detail, true, true, false));
        filmList.add(new Film("The Witcher", "Geralt de Rivia, un cazador de monstruos mutante, viaja en pos de su destino por un mundo turbulento en el que, a menudo, los humanos son peores que las bestias. Adaptación a la televisión de la saga literaria de Andrzej Sapkowski, que dio a su vez origen a una trilogía de prestigiosos videojuegos.", "Lauren Schmidt", "Henry Cavill, Freya Allan, Millie Brady, MyAnna Buring, Anya ChalotraBjörn Hlynur Haraldsson",R.drawable.the_witcher,R.drawable.the_witcher_detail, true, false, true));
        filmList.add(new Film("Miércoles","Sigue los años de Miércoles Addams como estudiante, intentando dominar su emergente habilidad psíquica mientras trata de resolver el misterio que enredó a sus padres." ,"Alfred Gough", "Jenna Ortega, Catherine Zeta-Jones, Luis Guzmán, Gwendoline Christie, Christina Ricci, Emma Myers", R.drawable.wednesday,R.drawable.wednesday_detail, false, true, false));

        return filmList;

    }
}
