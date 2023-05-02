ama(ana,miguel).
ama(luis,isabel).
ama(diana,laura).
ama(luis,carlos).
ama(miguel,ana).
ama(laura,juan).
ama(juan,luis).
ama(isabel,carlos).
ama(laura,diana).
ama(laura,juan).
se_aman_mutuamente(X, Y) :- ama(X, Y), ama(Y, X).
es_amado_por_alguien(X) :- ama(_, X).
ama_a_alguien(X) :- ama(X, _).
ama_sin_ser_correspondido(X) :- ama(X, Y), not(ama(Y, X)).
