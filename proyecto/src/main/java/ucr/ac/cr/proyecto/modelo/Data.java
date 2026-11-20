package ucr.ac.cr.proyecto.modelo;

import java.util.ArrayList;

/**
 * Contiene todo el contenido del libro "El origen del mundo y de la humanidad"
 * (cosmovisión cabécar): las páginas de la historia, las preguntas de
 * selección única y las preguntas de verdadero o falso.
 *
 * @author danie
 */
public class Data {

    private ArrayList<Page> pages;
    private ArrayList<QuizQuestion> quizQuestions;
    private ArrayList<TrueOrFalseQuestion> trueOrFalseQuestions;
    private ArrayList<Integer> historyOrder;

    public Data() {
        pages = new ArrayList<>();
        quizQuestions = new ArrayList<>();
        trueOrFalseQuestions = new ArrayList<>();
        historyOrder = new ArrayList<>();

        loadPages();
        loadQuizQuestions();
        loadTrueOrFalseQuestions();
        loadHistoryOrder();
    }

    // ---------------- Páginas del libro ----------------
    private void loadPages() {
        pages.add(new Page("Cuando el mundo todavía era piedra",
            String.join("\n\n",
                "En los primeros tiempos, cuando el mundo aún no tenía la forma que conocemos, todo era muy diferente. La superficie de la Tierra estaba cubierta de piedras y arena. No existían grandes bosques, ni campos verdes, ni tierras fértiles donde pudieran crecer las plantas. La roca madre se extendía por todas partes, fría y desnuda, sin ofrecer alimento ni refugio para la vida.",
                "Fue entonces cuando Sibö llegó para dar forma al mundo.",
                "Sibö era el creador, el encargado de organizar el universo y preparar un lugar donde pudieran vivir los seres. Sin embargo, aquella tarea no era sencilla. El mundo todavía estaba incompleto y necesitaba de muchos trabajos antes de poder convertirse en un hogar.",
                "Para construirlo, Sibö contó con la ayuda de distintos animales y seres sobrenaturales. En aquellos tiempos, los animales podían presentarse con apariencia humana y participar en las tareas del universo. Cada uno tenía habilidades particulares y podía contribuir de alguna manera a la creación.",
                "Poco a poco, el mundo comenzó a organizarse. Sin embargo, había un problema que Sibö todavía no había conseguido resolver: la superficie de piedra no podía sostener la vida. Aunque existiera un espacio donde habitar, no había tierra donde pudieran crecer los árboles, las plantas ni los alimentos.",
                "Sibö sabía que debía encontrar una manera de cubrir la roca madre con una sustancia capaz de alimentar las semillas y permitir que la vegetación se extendiera por todo el mundo.",
                "Un día, mientras se encontraba en su casa, ocurrió algo extraño. Dukur Bulú, uno de los seres que lo acompañaban, dejó sus excrementos en el suelo. De ellos comenzó a desprenderse un aroma agradable y, poco tiempo después, aparecieron pequeñas plantas que crecieron con fuerza.",
                "Sibö observó aquel acontecimiento con curiosidad. No comprendía cómo algo semejante podía dar origen a la vegetación en un mundo donde todavía no existía tierra fértil.",
                "Entonces preguntó a Dukur Bulú cómo había conseguido aquel resultado.",
                "El personaje le explicó que, durante algunas noches, viajaba hasta un santuario sagrado donde vivía una doncella llamada Namabasía, también conocida como Sulara. Allí se acercaba a ella y se alimentaba de su sangre mientras dormía. Después regresaba a la casa de Sibö y descansaba durante el día.",
                "Al escuchar aquello, Sibö comprendió que la esencia de la doncella estaba relacionada con el crecimiento de las plantas. En ella se encontraba aquello que necesitaba para completar la creación.",
                "La tierra todavía no existía, pero ahora Sibö sabía dónde encontrar lo que faltaba.")));

        pages.add(new Page("La doncella del santuario",
            String.join("\n\n",
                "Namabasía vivía en un lugar sagrado, junto a su madre y su abuela. Su hogar se encontraba apartado del mundo que Sibö estaba construyendo, protegido por la presencia de seres y fuerzas que no todos podían conocer.",
                "La joven era importante por la esencia que llevaba dentro de sí. Su existencia estaba relacionada con aquello que permitiría que la roca madre se transformara en tierra fértil.",
                "Su familia conocía los peligros que podían esconderse en los alrededores. Dukur Bulú era considerado un enemigo, pues durante las noches se acercaba para alimentarse de la sangre de la doncella. Por eso, su abuela le advertía que tuviera cuidado y que no confiara en los visitantes desconocidos.",
                "Mientras tanto, Sibö comprendió que necesitaba llegar hasta el santuario para llevar a Namabasía a su casa. No podía completar el mundo sin ella.",
                "Para conseguirlo, reunió a sus aliados y convocó a los Tkabí, espíritus guardianes relacionados con los animales y los elementos de la naturaleza. Les explicó que debían ayudarlo a traer a la doncella, pues su esencia permitiría cubrir la roca madre y preparar la tierra para recibir la vida.",
                "Los seres aceptaron acompañarlo.",
                "Sibö sabía que la familia de Namabasía no permitiría que se la llevaran fácilmente. Tendría que utilizar su inteligencia y preparar un plan para acercarse a ella sin despertar sospechas.",
                "Así comenzó el viaje hacia el santuario de los Namaitamí.",
                "Cuando llegaron, fueron recibidos por la abuela de la familia. Sibö explicó que había venido para invitar a la joven a recolectar unas semillas maduras de cacao. Dijo que era importante recogerlas antes de que se perdieran y que, después del trabajo, celebraría una gran fiesta en su casa.",
                "Sin embargo, la madre de Namabasía sospechó de aquella invitación. Le parecía extraño que Sibö apareciera de pronto en su hogar, pues nunca antes había visitado aquel lugar. Tampoco comprendía cómo había descubierto la dirección del santuario.",
                "A pesar de sus dudas, terminó acompañándolo para realizar la supuesta recolección.",
                "Pero cuando llegaron a la finca de Sibö, descubrió que no había nada sembrado. La invitación había sido un engaño. Mientras la mujer se encontraba lejos de su hogar, Sibö tendría la oportunidad de acercarse a la doncella.")));

        pages.add(new Page("El estruendo en el santuario",
            String.join("\n\n",
                "Sibö llamó entonces a Dukur Bulú y le pidió que lo guiara hasta el cuarto donde descansaba Namabasía.",
                "Al principio, Dukur Bulú se negó. Sabía que acercarse al lugar era peligroso y que podían descubrirlo. Sin embargo, Sibö insistió hasta que finalmente aceptó acompañarlo.",
                "Mientras tanto, el creador había preparado a otro de sus aliados: Tiá Yekela, el rey del rayo, conocido por su habilidad para disparar con gran precisión.",
                "Sibö le había encargado preparar una enorme bala de piedra y utilizar una larga cerbatana. El disparo debía ser lo suficientemente poderoso para provocar una gran destrucción en el santuario y permitir que su plan continuara.",
                "Cuando Dukur Bulú entró en la habitación, comenzó a alimentarse de la sangre de la doncella, como lo hacía durante sus visitas anteriores.",
                "Fue entonces cuando Tiá Yekela disparó.",
                "El proyectil atravesó el aire con una fuerza extraordinaria y golpeó la casa de los Namaitamí. El estruendo fue tan grande que sacudió los alrededores y destruyó parte de la vivienda. Sus habitantes fueron sorprendidos por el ataque y todo quedó envuelto en confusión.",
                "La madre de Namabasía, al escuchar el estruendo, corrió desesperadamente hacia su hogar. Quería descubrir qué había sucedido y encontrar a su hija.",
                "Pero Sibö había previsto que la mujer regresaría. Para retrasarla, colocó varios animales en su camino.",
                "Entre ellos había una pequeña venada que se detuvo frente a la entrada de la mansión y comenzó a llorar de una manera muy parecida a la doncella.",
                "Al escuchar aquel llanto, la madre creyó que se trataba de su hija. Se acercó rápidamente, pero al descubrir que era un animal, reaccionó con enojo. La tomó por el cuello y las patas y la apartó violentamente.",
                "Fue así que, desde entonces, las venadas tienen el cuello y las patas largos por dicho encuentro.",
                "La mujer continuó buscando entre los restos de su casa. En medio de la destrucción encontró a su madre tigra, que había quedado medio muerta y había perdido el habla debido al estruendo del ataque.",
                "Desesperada por lo ocurrido, se sentó a llorar.",
                "De sus lágrimas comenzaron a surgir diferentes animales: águilas, mariposas de muchos colores, búhos y gavilanes. Así, de su tristeza también nacieron nuevas criaturas que pasarían a formar parte del mundo.",
                "Pero la mujer seguía buscando a su hija. No sabía que Sibö había preparado otra distracción para impedir que pudiera encontrarla.")));

        pages.add(new Page("El engaño final y la transformación de la tierra",
            String.join("\n\n",
                "Después de recorrer los restos del santuario, la madre encontró una gran celebración. Había música y distintos seres danzaban el Bulúsikö o Sorbón.",
                "La celebración parecía extraña en medio de la destrucción que acababa de ocurrir. Sin embargo, Sibö había organizado todo para mantenerla distraída mientras sus acompañantes completaban la tarea.",
                "En medio de los participantes, la mujer observó una figura que parecía ser su hija. Al verla, corrió para abrazarla, convencida de que finalmente había encontrado a Namabasía.",
                "Pero aquella figura no era la doncella. Se trataba de un simulacro preparado por Sibö y sus acompañantes: una muñeca de balsa que tenía la apariencia de la joven.",
                "Mientras la madre era distraída por aquella figura, Sulá, padre de Namabasía, se encargó de llevar a su hija hasta el lugar donde se encontraba Sibö.",
                "Los ayudantes del creador no habían podido transportarla debido al peso de la joven, por lo que Sulá tuvo que intervenir personalmente.",
                "Finalmente, Namabasía llegó a la casa de Sibö.",
                "Allí se preparó una ceremonia especial para realizar la transformación que permitiría completar la creación del mundo.",
                "La doncella fue convertida en una sustancia llamada Jararia, la tierra fértil que cubriría la roca madre.",
                "Aquello que antes era piedra y arena comenzó a transformarse. La esencia de Namabasía se extendió sobre la superficie y cubrió los lugares donde crecerían las plantas, los árboles y los alimentos.",
                "La tierra adquirió una nueva función: ahora podía sostener la vida.",
                "Las semillas podrían germinar, las raíces encontrarían dónde sujetarse y los bosques podrían extenderse por las montañas. Los seres vivos tendrían un espacio donde alimentarse y desarrollarse.",
                "La transformación de Namabasía permitió que el mundo dejara de ser una superficie desnuda. La roca madre quedó cubierta por tierra fértil y el universo pudo convertirse en un lugar capaz de recibir la vida.",
                "Sibö había conseguido aquello que faltaba.",
                "Sin embargo, la creación todavía no estaba completa. Ahora existía la tierra, pero faltaba traer a los seres humanos que la habitarían.")));

        pages.add(new Page("Las semillas de Sibö",
            String.join("\n\n",
                "Una vez preparada la tierra, Sibö pudo dedicarse a traer la vida humana al mundo.",
                "En esta cosmovisión, los seres humanos están relacionados con las semillas de maíz. Se les conoce como ditsö, y su origen se encuentra vinculado con las semillas que Sibö trajo para poblar la Tierra.",
                "La imagen del maíz tiene un significado profundo. Una semilla necesita encontrar tierra fértil para desarrollarse. Necesita agua, alimento y condiciones adecuadas para crecer. De la misma manera, la humanidad necesitaba un mundo preparado para recibirla.",
                "La tierra creada a partir de Namabasía era el espacio donde aquellas semillas podrían germinar.",
                "Sibö no solamente debía traer personas al mundo, sino también darles un origen y una identidad. Los seres humanos formarían parte de una comunidad, tendrían vínculos entre sí y compartirían una relación con la naturaleza que los rodeaba.",
                "La siembra de las semillas de maíz representa el nacimiento de los pueblos y de los diferentes clanes cabécares.",
                "En medio de la celebración y el baile del Sorbón, las semillas fueron sembradas. De ellas surgieron los grupos que darían origen a las distintas familias y comunidades.",
                "Así, la humanidad comenzó a poblar el mundo.",
                "Los seres humanos no eran ajenos a la tierra que pisaban. Su origen estaba relacionado con ella desde el principio. Así como el maíz crece gracias al suelo que lo recibe, las personas habían nacido gracias a la tierra que Sibö había preparado.",
                "Por eso, el maíz no era solamente un alimento. También representaba la procedencia de las personas y la conexión entre la humanidad, la tierra y el creador.",
                "Existían, además, grupos que tenían un origen especial. Los primeros Kóktúwák y Tëkäbíwák fueron traídos por Sibö con forma humana desde el mundo inferior. Se les encargó cuidar las plantas de maíz al principio y al final de la siembra, mientras que los demás indígenas fueron traídos como semillas.",
                "Con el tiempo, los seres humanos comenzaron a organizarse en clanes, estableciendo relaciones familiares y responsabilidades que formarían parte de su identidad.")));

        pages.add(new Page("Los clanes y los vínculos con la naturaleza",
            String.join("\n\n",
                "Con el nacimiento de los seres humanos también surgió la necesidad de organizar la vida en comunidad.",
                "Los clanes representaban los vínculos entre las personas y sus antepasados. Cada uno tenía su propia identidad y estaba relacionado con determinados elementos de la naturaleza.",
                "La familia no se limitaba únicamente a los padres, las madres y los hijos. También existían relaciones simbólicas con animales, plantas y otros elementos naturales.",
                "Por eso, los seres humanos no se consideraban separados del resto de los seres vivos. Los animales y las plantas formaban parte de una red de relaciones que conectaba a todos los habitantes del mundo.",
                "Cada persona tenía un lugar dentro de esa organización y debía respetar los vínculos que la unían con los demás.",
                "Los conocimientos transmitidos por los mayores permitían conservar la memoria de los orígenes, comprender las relaciones entre los clanes y reconocer las responsabilidades de cada integrante de la comunidad.",
                "La naturaleza también formaba parte de esa memoria. Los ríos, los bosques, las montañas y los animales no eran simples elementos del paisaje, sino partes fundamentales del mundo que Sibö había creado.",
                "La humanidad había nacido de las semillas, pero no podía existir sin aquello que las rodeaba.")));

        pages.add(new Page("La Gran Casa Cósmica",
            String.join("\n\n",
                "El universo creado por Sibö no estaba formado únicamente por la tierra que habitaban los seres humanos. Existían diferentes dimensiones relacionadas entre sí.",
                "Se reconocían tres grandes espacios: el inframundo, el mundo de en medio y el mundo de arriba.",
                "Los seres humanos habitaban el mundo de en medio, pero su existencia estaba relacionada con las otras dimensiones y con los seres espirituales que las habitaban.",
                "Esta organización podía representarse mediante la casa cónica tradicional, conocida como Usule. Su estructura simbolizaba la forma del universo y la relación entre sus diferentes niveles.",
                "La casa no era solamente un refugio. También representaba el orden del cosmos y la manera en que los distintos mundos se conectaban.",
                "El inframundo era el lugar donde habitaban seres y espíritus que participaban en los acontecimientos de la creación. Allí se encontraba el origen de algunos de los elementos necesarios para completar el mundo.",
                "El mundo de en medio era el espacio de los seres humanos, los animales y las plantas. Era el lugar donde se desarrollaba la vida cotidiana y donde las personas debían mantener el equilibrio con su entorno.",
                "El mundo de arriba también formaba parte de aquella estructura y estaba relacionado con las fuerzas y seres que participaban en el orden del universo.",
                "Así, la creación no consistía solamente en formar un suelo donde caminar. Sibö había organizado un universo completo, donde cada dimensión tenía su lugar y donde todos los elementos se encontraban relacionados.")));

        pages.add(new Page("El deber de cuidar la tierra",
            String.join("\n\n",
                "Después de la creación, los seres humanos recibieron un mundo lleno de vida. La tierra podía alimentar las plantas, los árboles ofrecían refugio, los animales habitaban los bosques y el agua recorría las montañas.",
                "Pero aquella creación también traía consigo una responsabilidad.",
                "La tierra no debía ser tratada como algo que podía utilizarse sin límites. Era el lugar que había permitido el nacimiento de la humanidad y, por lo tanto, debía ser respetada.",
                "El agua era indispensable para la existencia de los seres vivos. Los ríos y las fuentes permitían que las plantas crecieran y que los animales encontraran lo necesario para sobrevivir.",
                "Los bosques ofrecían alimento y refugio. Las montañas protegían los nacimientos de agua y los animales contribuían al equilibrio del mundo.",
                "Todo tenía una función.",
                "Los seres humanos debían aprender a reconocer las señales de la naturaleza y comprender sus ciclos. Los cambios en las hojas, la aparición de flores y frutos, las fases de la Luna y las temporadas de lluvia y sequía podían orientar las actividades de la comunidad.",
                "Antes de utilizar los recursos de la naturaleza, era importante pedir permiso y actuar con respeto. También era necesario compartir con los demás y evitar el desperdicio.",
                "La vida no dependía únicamente de una persona. Todos los seres formaban parte de una misma existencia y el bienestar de la comunidad estaba relacionado con el equilibrio del entorno.",
                "La tierra podía alimentar a los seres humanos, pero también necesitaba ser cuidada. El agua podía dar vida, pero debía mantenerse limpia. Los bosques podían ofrecer recursos, pero no debían ser destruidos sin consideración.",
                "La humanidad tenía que recordar de dónde provenía.")));

        pages.add(new Page("El legado de Sibö",
            String.join("\n\n",
                "Desde aquel tiempo, el mundo quedó preparado para recibir la vida.",
                "La roca madre había sido cubierta por la tierra fértil. Las semillas habían encontrado un lugar donde germinar y los seres humanos habían comenzado a poblar el mundo. Los clanes establecieron sus vínculos y las diferentes dimensiones del universo quedaron relacionadas dentro de una misma estructura.",
                "Todo había comenzado con la necesidad de transformar un mundo de piedra en un lugar capaz de albergar la vida.",
                "Sibö había contado con la ayuda de numerosos seres y había realizado grandes transformaciones para completar su obra. La esencia de Namabasía se convirtió en la tierra que sostendría las plantas y alimentaría a las semillas. De aquellas semillas surgió la humanidad, vinculada desde su origen con el maíz y con la naturaleza.",
                "Por eso, la historia de la creación no es solamente un relato sobre el comienzo de las cosas. También explica el lugar que ocupa la humanidad dentro del universo.",
                "Los seres humanos no llegaron para dominar un mundo vacío. Llegaron a formar parte de una creación que ya estaba llena de relaciones, responsabilidades y vida.",
                "La tierra, el agua, los animales, las plantas y los espíritus forman parte de una misma totalidad. Ninguno existe completamente separado de los demás.",
                "La humanidad nació de las semillas de Sibö y encontró su hogar en la tierra que había sido preparada para recibirla.",
                "Desde entonces, conservar ese equilibrio y respetar aquello que hizo posible la vida es parte del legado de la creación.",
                "Porque el mundo no fue hecho únicamente para ser habitado: fue hecho para ser cuidado.")));
    }

    // ---------------- Preguntas de selección única ----------------
    // Orden de los parámetros: pregunta, opción A, B, C, D, letra correcta
    private void loadQuizQuestions() {
        quizQuestions.add(new QuizQuestion(
            "¿Cuál era el principal problema que Sibö debía resolver para completar la creación del mundo?",
            "La ausencia de animales que habitaran los bosques.",
            "La falta de agua para alimentar los ríos.",
            "La superficie de piedra y arena que impedía el crecimiento de las plantas.",
            "La ausencia de espíritus guardianes que protegieran la Tierra.",
            "C"));

        quizQuestions.add(new QuizQuestion(
            "¿Qué relación tenía Namabasía con la transformación de la Tierra?",
            "Su esencia fue transformada en Jararia, la tierra fértil que cubrió la roca madre.",
            "Era la encargada de sembrar las primeras semillas de maíz.",
            "Protegía el santuario donde habitaban los animales sobrenaturales.",
            "Fue quien creó los tres niveles del universo.",
            "A"));

        quizQuestions.add(new QuizQuestion(
            "¿Qué representan las semillas de maíz en el origen de la humanidad según la historia?",
            "El nacimiento de los animales que acompañaron a Sibö.",
            "El origen de los diferentes pueblos y clanes cabécares.",
            "La creación de los espíritus del inframundo.",
            "La transformación de las piedras en montañas.",
            "B"));

        quizQuestions.add(new QuizQuestion(
            "¿Cuáles son los tres grandes espacios que conforman el universo en la cosmovisión descrita?",
            "El cielo, el mar y la tierra.",
            "El mundo espiritual, el mundo animal y el mundo humano.",
            "Las montañas, los bosques y los ríos.",
            "El inframundo, el mundo de en medio y el mundo de arriba.",
            "D"));

        quizQuestions.add(new QuizQuestion(
            "¿Cuál es una de las principales responsabilidades que adquiere la humanidad después de la creación?",
            "Dominar los recursos naturales para garantizar su supervivencia.",
            "Separarse de los animales y establecer su propio territorio.",
            "Respetar y cuidar la naturaleza, manteniendo el equilibrio entre los seres vivos.",
            "Evitar utilizar los recursos naturales para no alterar el mundo.",
            "C"));

    }

    // ---------------- Preguntas de verdadero o falso ----------------
    private void loadTrueOrFalseQuestions() {
        trueOrFalseQuestions.add(new TrueOrFalseQuestion(
            "Dukur Bulú visitaba durante las noches a Namabasía para alimentarse de su sangre.", true));

        trueOrFalseQuestions.add(new TrueOrFalseQuestion(
            "Tiá Yekela era conocido como el rey del rayo y ayudó a Sibö atacando el santuario con un proyectil de piedra.", true));

        trueOrFalseQuestions.add(new TrueOrFalseQuestion(
            "La madre de Namabasía logró reconocer a su hija entre los participantes de la celebración del Sorbón y consiguió llevársela de regreso al santuario.", false));

        trueOrFalseQuestions.add(new TrueOrFalseQuestion(
            "Los primeros Kóktúwák y Tëkäbíwák fueron traídos por Sibö con forma humana desde el mundo inferior.", true));

        trueOrFalseQuestions.add(new TrueOrFalseQuestion(
            "La casa cónica tradicional, conocida como Usule, representaba únicamente un refugio para las familias y no tenía relación con la estructura del universo.", false));

    }

    // ---------------- Orden correcto de las imagenes ----------------
    // Numero de imagen (img1 = 1, img2 = 2, ...) en el orden en que ocurren los sucesos
    private void loadHistoryOrder() {
        historyOrder.add(1);
        historyOrder.add(2);
        historyOrder.add(3);
        historyOrder.add(4);
        historyOrder.add(5);
    }

    public ArrayList<Page> getPages() {
        return pages;
    }

    public ArrayList<QuizQuestion> getQuizQuestions() {
        return quizQuestions;
    }

    public ArrayList<TrueOrFalseQuestion> getTrueOrFalseQuestions() {
        return trueOrFalseQuestions;
    }

    public ArrayList<Integer> getHistoryOrder() {
        return historyOrder;
    }
}
