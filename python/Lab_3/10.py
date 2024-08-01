segment = {
  '0' :[' _','| |','|_|'],
  '1' :[' ',' |',' |'],
  '2' :[' _',' _|','|_'],
  '3' :['_','_|','_|'],
  '4' :['','|_|','  |'],
  '5' :[' _','|_',' _|'],
  '6' :[' _','|_','|_|'],
  '7' :['_',' |',' |'],
  '8' :[' _','|_|','|_|'],
  '9' :[' _','|_|',' _|']
}

def print_8_seg(num) :
    rows = ['','','']
    for digit in str(num) :
        for j in range(3):
            rows[j] = segment[digit][j]
    
    for row in rows:
        print(row)

N = int(input("Enter a number : "))
for i in range(0,N+1) :
   print_8_seg(i)