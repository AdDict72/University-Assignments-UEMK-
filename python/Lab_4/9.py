def reverse_string(s):
    # Reverse the given string.
    return s[::-1]

def is_palindrome(s):
    # Check if the given string is a palindrome.
    return s == s[::-1]

def ends_with_substring(s, substring):
    # Check if the string ends with the given substring.
    return s.endswith(substring)

def capitalize_words(s):
    # Capitalize the first letter of each word in the string.
    return ' '.join(word.capitalize() for word in s.split())

def is_anagram(s1, s2):
    # Check if s1 is an anagram of s2.
    return sorted(s1) == sorted(s2)

def remove_vowels(s):
    # Remove vowels from the given string.
    vowels = 'aeiouAEIOU'
    return ''.join(char for char in s if char not in vowels)

def longest_word_length(sentence):
    # Find the length of the longest word in a sentence.
    words = sentence.split()
    return max(len(word) for word in words) if words else 0

if __name__ == "__main__":
    input_string = input("Enter a string: ")

    reversed_string = reverse_string(input_string)
    print("Reversed string:", reversed_string)

    palindrome_status = is_palindrome(input_string)
    print("Is palindrome:", palindrome_status)

    substring = input("Enter a substring to check if the string ends with it: ")
    ends_with_status = ends_with_substring(input_string, substring)
    print("Ends with substring:", ends_with_status)

    capitalized_string = capitalize_words(input_string)
    print("Capitalized words:", capitalized_string)

    another_string = input("Enter another string to check if it's an anagram: ")
    anagram_status = is_anagram(input_string, another_string)
    print("Is anagram:", anagram_status)

    string_without_vowels = remove_vowels(input_string)
    print("String without vowels:", string_without_vowels)

    sentence = input("Enter a sentence to find the length of the longest word: ")
    longest_word_len = longest_word_length(sentence)
    print("Length of the longest word:", longest_word_len)
