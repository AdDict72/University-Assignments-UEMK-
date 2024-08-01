def CheckSeason(month) :
    if month in ('Dec','Jan','Feb','December','January','February'):
        return 'Winter'
    if month in ('Jun','Jul','Aug','June','July','August'):
        return 'Summer'
    if month in ('Mar','Apr','May','April','March'):
        return 'Spring'
    if month in ('Sep','Oct','Nov','September','October','November'):
        return 'Autumm'
    
month = input("Enter the Month to know the Season : ")
season = CheckSeason(month)
print("The season is : ",season)