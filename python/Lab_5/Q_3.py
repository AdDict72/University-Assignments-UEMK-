# Create fruits, vegetables and animal products tuples.
# I. Join the three tuples and assign it to a variable called food_stuff_tp.
# II. Change the about food_stuff_tp tuple to a food_stuff_lt list
# III. Slice out the middle item or items from the food_stuff_tp tuple or food_stuff_lt list.
# IV. Slice out the first three items and the last three items from food_staff_lt list
# V. Delete the food_staff_tp tuple completely

fruits = ('mango', 'apple', 'orange', 'banana')
vegetables = ('carrot', 'spinach', 'potato', 'tomato')
animal_products = ('milk', 'cheese', 'meat', 'curd')

food_stuff_tp = fruits + vegetables + animal_products
print(f"food_stuff_tp = {food_stuff_tp}")

food_stuff_lt = list(food_stuff_tp)
print(f"food_stuff_lt = {food_stuff_lt}")

if len(food_stuff_tp) % 2 == 0:
    print(f"Slicing out the middle terms -> {food_stuff_tp[len(food_stuff_tp) // 2 - 1]} and {food_stuff_tp[len(food_stuff_tp) // 2]}")
else:
    print(f"Slicing out the middle term -> {food_stuff_tp[len(food_stuff_tp) // 2]}")

print(f"First three items are ->", end=" ")
for i in range(3):
    print(food_stuff_lt[i], end=", ")
print(f"\nLast three items are ->", end=" ")
for i in range(3):
    print(food_stuff_lt[len(food_stuff_lt) - i - 1], end=", ")

del food_stuff_tp
try: 
    print(food_stuff_tp)
except Exception as e:
    print(f"\n\nCannot access, the tuple is deleted.\nError -> {e}")