# A = {19, 22, 24, 20, 25, 26}
# B = {19, 22, 20, 25, 26, 24, 28, 27}
# From the above sets A and B
# I. Join A and B
# II. Find A intersection B
# III. Is A subset of B
# IV. Are A and B disjoint sets
# V. Join A with B and B with A
# VI. What is the symmetric difference between A and B
# VII. Delete the sets completely

A = {19, 22, 24, 20, 25, 26}
B = {19, 22, 20, 25, 26, 24, 28, 27}
C = A.union(B)
print(f"After joining set is ->\n{C}")

print(f"A intersection B is -> {A.intersection(B)}")

if A.issubset(B):
    print("A is a subset of B")
else:
    print("A is not a subset of B")

if A.isdisjoint(B):
    print("A and B are disjoint sets")
else:
    print("A and B are not disjoint sets")

# print(f"Symmetric difference -> {A ^ B}")
print(f"Symmetric difference -> {A.symmetric_difference(B)}")

del A, B

try:
    print(A, B)
except Exception as e:
    print(f"\n\nCannot access, the sets are deleted.\nError -> {e}")