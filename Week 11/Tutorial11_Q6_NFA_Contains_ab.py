"""Question 6: NFA that accepts strings over {a, b} containing substring ab.

Requires automata-lib: python3 -m pip install automata-lib
"""
from automata.fa.nfa import NFA


nfa = NFA(
    states={"q0", "q1", "q2"},
    input_symbols={"a", "b"},
    transitions={
        # q0 consumes any prefix and can nondeterministically begin matching at a.
        "q0": {"a": {"q0", "q1"}, "b": {"q0"}},
        "q1": {"a": set(), "b": {"q2"}},
        # Once "ab" has been found, accept any remaining suffix.
        "q2": {"a": {"q2"}, "b": {"q2"}},
    },
    initial_state="q0",
    final_states={"q2"},
)


def check(value):
    if any(symbol not in {"a", "b"} for symbol in value):
        return False
    return nfa.accepts_input(value)


if __name__ == "__main__":
    examples = ["ab", "aab", "baba", "abb", "a", "ba", "", "abc"]
    for value in examples:
        verdict = "ACCEPTED" if check(value) else "REJECTED"
        print(f"{value!r}: {verdict}")

    while True:
        value = input("Enter a string over {a, b} (blank to quit): ")
        if value == "":
            break
        verdict = "ACCEPTED" if check(value) else "REJECTED"
        print(verdict)
