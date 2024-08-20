# UFP
def calculate_ufp(fp_counts, ratios, weights):
    ufp = 0
    for fp_type, count in fp_counts.items():
        ratio = ratios[fp_type]
        for i, weight in enumerate(weights):
            ufp += ratio[i] * weight
    return ufp

# TDI
def calculate_tdi(reliability, complexity):
    return reliability + complexity

# VAF
def calculate_vaf(tdi):
    return tdi * 0.01 + 0.65

# AFP
def calculate_afp(ufp, vaf):
    return ufp * vaf

# data
fp_counts = {'i/p': 60, 'file': 25, 'query': 35, 'i/f': 20, 'o/p': 25}
ratios = {'i/p': [1, 6, 3], 'file': [1, 2, 2], 'query': [0, 1, 0], 'i/f': [0, 0, 1], 'o/p': [2, 2, 1]}
weights = [0.5, 1.0, 1.5]
reliability = 0.65
complexity = 0.75


ufp = calculate_ufp(fp_counts, ratios, weights)
tdi = calculate_tdi(reliability, complexity)
vaf = calculate_vaf(tdi)
afp = calculate_afp(ufp, vaf)

# Output 
print(f"UFP: {ufp}")
print(f"TDI: {tdi}")
print(f"VAF: {vaf}")
print(f"AFP: {afp}")
