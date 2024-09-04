# Create a set given below
# it_companies = {'Facebook', 'Google', 'Microsoft', 'Apple', 'IBM', 'Oracle', 'Amazon'}
# I. Find the length of the set it_companies
# II. Add 'Twitter' to it_companies
# III. Insert multiple IT companies at once to the set it_companies
# IV. Remove one of the companies from the set it_companies
# V. What is the difference between remove and discard

it_companies = {'Facebook', 'Google', 'Microsoft', 'Apple', 'IBM', 'Oracle', 'Amazon'}

print(f"Length = {len(it_companies)}")

it_companies.add('Twitter')

print(f"After adding 'Twitter' new set is -> {it_companies}")

new_names = ['TCS', 'Accenture', 'Cognigent']
it_companies.update(new_names)

print(f"After inserting multiple IT companies set is ->\n{it_companies}")
company = input("Enter a company name to remove: ")
it_companies.remove(company)
print(f"After removing '{company}' set is ->\n{it_companies}")
