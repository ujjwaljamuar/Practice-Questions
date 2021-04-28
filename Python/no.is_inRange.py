def ran_check(num,low,high):
    if num in range(low,high):
        return print(f'{num} is in range of {low},{high}')
    else:
        return False


        #or
def ran_bool(num,low,high):
    return num in range(low,high)