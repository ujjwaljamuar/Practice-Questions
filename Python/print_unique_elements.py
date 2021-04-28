def unique_list(lst):
    return set(lst)

#or
def unique_list(lst):
    seen=[]
    for nums in lst:
        if nums not in seen:
            seen.append(nums)
    return seen