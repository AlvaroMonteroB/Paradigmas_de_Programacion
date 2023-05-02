juega(hector,baloncesto).
juega(miguel,balonmano).
juega(miguel,rugby).
juega(alicia,tenis).
juega(alicia,baloncesto).
juega(alicia,ajedrez).
mismo_deporte(Persona1, Persona2) :-
    juega(Persona1, Deporte),
    juega(Persona2, Deporte),
    Persona1 \= Persona2.

