import math

def halstead_metrics(operators, operands):
    n1 = len(set(operators))
    n2 = len(set(operands))
    N1 = len(operators)
    N2 = len(operands)
    
    # Length of the program
    N = N1 + N2
    
    # Vocabulary size
    eta = n1 + n2
    
    # Volume
    V = N * math.log2(eta)
    
    # Estimated length
    N_hat = n1 * math.log2(n1) + n2 * math.log2(n2)
    
    # Difficulty
    #D = (n1 / 2) * (N2 / n2)
    
    # Potential Volume
    v =(2+n2) * math.log2(2+n2)

    #Implementation Level
    L = v/V

    # Effort
    #E = D * V
    E = V/L

    # Time 
    T = E / 18
    
    
    return {
        "n1 (distinct operators)": n1,
        "n2 (distinct operands)": n2,
        "N1 (total operators)": N1,
        "N2 (total operands)": N2,
        "Program Length (N)": N,
        "Vocabulary (eta)": eta,
        "Volume (V)": V,
        "Estimated Length ": N_hat,
        "Implementation Level (L)": L,
        "Potential Volume (v)": v,
        "Effort (E)": E,
        "Time to Implement (T)": T,
    }

operators = ['=', 'while', '>', '=', '+', '-', 'print', '(', ')', ';']
operands = ['Z', '0', 'X', 'Y', '1']

metrics = halstead_metrics(operators, operands)
for key, value in metrics.items():
    print(f"{key}: {value}")
