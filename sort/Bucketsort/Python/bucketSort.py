def bucketsort(maxint, arraytosort):
    buckets = [0] * maxint
    i = 0
    while i < len(arraytosort):
        buckets[arraytosort[i]] = arraytosort[i]
        i += 1
    return buckets


arraytosort = [64, 34, 25, 12, 22, 11, 90]
maxint = 100

sortedarray = bucketsort(maxint, arraytosort)

print ("Sorted array is:")
print(sortedarray, end='')