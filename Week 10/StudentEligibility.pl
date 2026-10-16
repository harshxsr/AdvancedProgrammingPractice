python(arun, pass).
datastructures(arun, pass).

python(bala, pass).
datastructures(bala, fail).

python(charan, pass).
datastructures(charan, pass).

python(divya, fail).
datastructures(divya, pass).

eligible(X) :-
    python(X, pass),
    datastructures(X, pass).