def is_anagram(a, b)
    normalized_a = a.downcase
    normalized_b = b.downcase
  
    sorted_a = normalized_a.chars.sort.join
    sorted_b = normalized_b.chars.sort.join
    
    sorted_a == sorted_b
  end
  

puts is_anagram("anagram", "margana")  # Output: true
puts is_anagram("anagramm", "marganaa") # Output: false
puts is_anagram("Hello", "hello")      # Output: true

# For "anagram" and "margana": Both strings sort to "aaagmnr". They are anagrams.
# For "anagramm" and "marganaa": They sort to "aaagmnmr" and "aaaagmnr", respectively. They are not anagrams because of the different counts of 'a' and 'm'.
# For "Hello" and "hello": Both normalize to "hello" and sort to "ehllo". They are anagrams.