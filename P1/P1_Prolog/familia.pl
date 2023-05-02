hombre(antonio).
hombre(juan).
hombre(luis).
hombre(rodrigo).
hombre(ricardo).
mujer(isabel).
mujer(ana).
mujer(marta).
mujer(carmen).
mujer(laura).
mujer(alicia).
matrimonio(antonio, ana).
matrimonio(juan,carmen).
matrimonio(luis,isabel).
matrimonio(rodrigo,laura).
hijo(juan, antonio).
hijo(rodrigo, antonio).
hija(marta, antonio).
hijo(juan, ana).
hijo(rodrigo, ana).
hija(marta, ana).
hija(carmen,luis).
hija(carmen,isabel).
hija(alicia,rodrigo).
hija(alicia,isabel).
matrimonio(X, Y) :- matrimonio(Y, X).
nieto(X, Y) :- hijo(X, Z), (hijo(Z, Y) ; hija(Z, Y)), matrimonio(Z, _).
abuelo(X, Y) :- (hijo(Y, Z) ; hija(Y, Z)), (hijo(Z, X) ; hija(Z, X)).
hermano(X, Y) :- hijo(X, Z), hijo(Y, Z), X \= Y.
tio(X, Y) :- hermano(X, Z), (hijo(Y, Z) ; hija(Y, Z)), X \= Y.
tia(X, Y) :- hermana(X, Z), (hijo(Y, Z) ; hija(Y, Z)), X \= Y.
primo(X, Y) :- (tio(Z, Y) ; tia(Z, Y)), (hijo(X, Z) ; hija(X, Z)), X \= Y.
prima(X, Y) :- (tio(Z, Y) ; tia(Z, Y)), hija(X, Z), X \= Y.
suegro(X, Y) :- matrimonio(Y, Z), (hijo(X, Z) ; hija(X, Z)).
