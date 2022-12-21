package com.curso.javacore.introducaometodos.test;

import com.curso.javacore.introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {

        Professor prof = new Professor();
        Professor prof2 = new Professor();

        prof.numProf = 219;
        prof.nome = "Aurora Filipa";
        prof.morada = "Rua das Flores";
        prof.nascimento = "21/04/1999";

        prof2.numProf = 325;
        prof2.nome = "Rui Silva";
        prof2.morada = "Rua Alto de Trigais";
        prof2.nascimento = "26/03/1999";

        prof.imprime();
        prof2.imprime();
    }
}
