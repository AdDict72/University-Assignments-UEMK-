def print_geometric_sequence(start, ratio, terms):
    current_term = start
    for i in range(terms):
        print(current_term, end=" ")
        current_term *= ratio

start = 2
ratio = 3
terms = 6

print_geometric_sequence(start, ratio, terms)
