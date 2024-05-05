# Output Format

# Print the name(s) of any student(s) having the second lowest grade in.
# If there are multiple students, order their names alphabetically and print each one on a new line.

# Sample Input 0

# 5
# Harry
# 37.21
# Berry
# 37.21
# Tina
# 37.2
# Akriti
# 41
# Harsh
# 39

# Sample Output 0

# Berry
# Harry


if __name__ == '__main__':
    L=[]
    for _ in range(int(input())):
        name = input()
        score = float(input())
        
        L.append([name,score])
    L.sort(key=lambda x: x[1],reverse=True)
    second_lowest_grade = sorted(set(score for name, score in L))[1]
    second_lowest_students = [name for name, score in L if score == second_lowest_grade]
    for student in sorted(second_lowest_students):
        print(student)
