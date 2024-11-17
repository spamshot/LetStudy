package com.example.letstudy.data

data class QuestionsPhysics(val questionP: String, val optionsP: List<String>, val correctAnswerP: Int)

val questionsP = listOf(
    QuestionsPhysics("What is Heisenberg's uncertainty principle?",listOf("there is inherent uncertainty in the act of measuring a variable of a particle", "relationship between mass and energy", " Fleetwood Bounder", "a theory that describes how bones adapt to mechanical stress"), 1),
    QuestionsPhysics("who came up with this law?. A robot must protect its own existence as long as such protection does not conflict with the First or Second Law.?",listOf("Lisa Randall", "Max Born", "Niels Bohr", "Isaac Asimov's"), 4),
    QuestionsPhysics("What is the acceleration due to gravity on Earth?",listOf("9.8 meters per second squared", "4.2 meters per second squared", "0.30 meters per second squared", "11.8 meters per second squared"), 1),
    QuestionsPhysics("How does a lever work to lift heavy objects?",listOf("by using gravity displacement", "by spreading out the effort over a longer distance", "all psychological", "shortening the distance"), 2),
    QuestionsPhysics("How many laws did Newton discover?",listOf("12", "7", "3", "5"), 3),
    QuestionsPhysics("What is the most common isotope of hydrogen?",listOf("Protium", "Tritium", "Carbon", "Uranium"), 1),
    QuestionsPhysics("What is the name of the effect that causes the frequency of a wave to change due to the relative motion between the source and the observer?",listOf("Accordion effect", "Auger effect", "Doppler effect", "Dember effect"), 3),
    QuestionsPhysics("What is the principle behind a refrigerator’s cooling mechanism?",listOf("Conduction", "Convection", "Radiation", "Irradiation"), 2),
    QuestionsPhysics("What is the term for the study of motion without considering the forces that cause it?",listOf("Dynamics", "Statics", "Kinetics", "Kinematics"), 4),
    QuestionsPhysics("How does the Michelson-Morley experiment contribute to our understanding of light?",listOf("Cold light travels faster than warm light", "light can't be cold it only can be warm", "no matter which direction light traveled, it always moved at the same speed", "light travels at different speeds"), 3),
    QuestionsPhysics("Water is made up of what elements?",listOf("hydrogen and oxygen", "heat, fuel, and oxygen", "aluminum and nitrogen", "oxygen"), 1),
    QuestionsPhysics("How do X-rays differ from visible light?",listOf("X-rays are made up of particles, whereas visible light is made up of waves.", "X-rays are made up of waves, whereas visible light is made up of particles.", "X-rays use magnets and radio waves", "X-rays are made up of electrons and protons"), 1),
    QuestionsPhysics("What is the speed of light in a vacuum?",listOf("300,402,313 m / s", "399,792,458 m / s", "229,792,458 m / s", "299,792,458 m / s"), 4),
)

