# The following is a list of 10 students ages:
# ages = [19, 22, 19, 24, 20, 25, 26, 24, 25, 24]
# I. Sort the list and find the min and max age
# II. Add the min age and the max age again to the list
# III. Find the median age (one middle item or two middle items divided by two)
# IV. Find the average age (sum of all items divided by their number )
# V. Find the range of the ages (max minus min)
# VI. Compare the value of (min - average) and (max - average), use _abs()_ method

ages = [19, 22, 19, 24, 20, 25, 26, 24, 25, 24]

ages = sorted(ages)

min_val = min(ages)
max_val = max(ages)

print(f"Sorted List ->\n{ages}")
print(f"Min = {min_val} and Max = {max_val}")

ages.append(min_val)
ages.append(max_val)

print(f"After adding Min and Max again the list ->\n{ages}")

if len(ages) % 2 == 0:
    median = (ages[len(ages) // 2] + ages[len(ages) // 2 - 1]) / 2
else:
    median = ages[len(ages) // 2]

print(f"Median = {median}")

average = sum(ages) / len(ages)
print(f"Average = {average}")

print(f"Range = {max_val - min_val}")

min_diff = abs(min_val - average)
max_diff = abs(max_val - average)

print(f"(min - average) = {min_diff}")
print(f"(max - average) = {max_diff}")