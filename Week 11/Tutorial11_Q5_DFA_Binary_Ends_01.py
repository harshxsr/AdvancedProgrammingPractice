"""Question 5: DFA that accepts binary strings ending in 01.

Requires automata-lib: python3 -m pip install automata-lib
"""
from automata.fa.dfa import DFA


dfa = DFA(
    states={"q0", "q1", "q2"},
    input_symbols={"0", "1"},
    transitions={
        "q0": {"0": "q1", "1": "q0"},
        "q1": {"0": "q1", "1": "q2"},
        "q2": {"0": "q1", "1": "q0"},
    },
    initial_state="q0",
    final_states={"q2"},
)


def is_valid_binary_string(value):
    return all(symbol in {"0", "1"} for symbol in value)


def check(value):
    if not is_valid_binary_string(value):
        return False
    return dfa.accepts_input(value)


if __name__ == "__main__":
    examples = ["01", "101", "1101", "0", "10", "011", "", "a01"]
    for value in examples:
        verdict = "ACCEPTED" if check(value) else "REJECTED"
        print(f"{value!r}: {verdict}")

    while True:
        value = input("Enter a binary string (blank to quit): ")
        if value == "":
            break
        verdict = "ACCEPTED" if check(value) else "REJECTED"
        print(verdict)
