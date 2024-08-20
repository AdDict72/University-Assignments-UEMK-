input_lines = []
print("Enter the lines (Press Enter twice to stop):")
while True:
        line = input()
        if line:
            input_lines.append(line)
        else:
            break

output_lines = [line.upper() for line in input_lines]
for line in output_lines:
    print(line)
