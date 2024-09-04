# Create a person dictionary.
# person={
# 'first_name': 'Asabeneh',
# 'last_name': 'Yetayeh',
# 'age': 250,
# 'country': 'Finland',
# 'is_marred': True,
# 'skills': ['JavaScript', 'React', 'Node', 'MongoDB', 'Python'],
# 'address': {
#       'street': 'Space street',
#       'zipcode': '02210'
#       }
# }
# I. Check if the person dictionary has skills key, if so print out the middle skill in the skills list.
# II. Check if the person dictionary has skills key, if so check if the person has 'Python' skill and print out the result.
# III. If a person skills has only JavaScript and React, print('He is a front end developer'), if the person skills has Node, Python, MongoDB, print('He is a backend developer'), if the person skills has React, Node and MongoDB, Print('He is a fullstack developer'), else print('unknown title') - for more accurate results more conditions can be nested!
# IV. If the person is married and if he lives in Finland, print the information in the following
# format:
# ```py
# Asabeneh Yetayeh lives in Finland. He is married.
# ``

person = {
'first_name': 'Asabeneh',
'last_name': 'Yetayeh',
'age': 250,
'country': 'Finland',
'is_marred': True,
'skills': ['JavaScript', 'React', 'Node', 'MongoDB', 'Python'],
'address': {
      'street': 'Space street',
      'zipcode': '02210'
      }
}

if "skills" in person:
    skills = person['skills']
    print(f"Yes\nSkill = {skills[len(skills) // 2]}")
    if 'Python' in skills:
        print("Yes, Python is Present")
    else: 
        print("No, Python is not Present")
    if 'React' in skills and 'Node' in skills and 'MongoDB' in skills:
        print("He is a fullstack developer")
    elif 'Node' in skills and 'Python' in skills and 'MongoDB' in skills:
        print('He is a backend developer')
    elif 'JavaScript' in skills and 'React' in skills:
        print('He is a front end developer')
    else:
        print('unknown title')
else:
    print("No, skill key is not found")

if person['is_marred'] and person['country'] == 'Finland':
    print(f"{person['first_name']} {person['first_name']} lives in {person['country']}. He is mraried.")