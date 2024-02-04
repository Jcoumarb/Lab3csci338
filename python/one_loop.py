def one_loop(l: list) -> bool:
	encountered = set()
	for i in l:
		if i in encountered:
			return True
		encountered.add(i)
	return False

if __name__ == "__main__":
	result1 = one_loop([1,2,3,4]);
	print (result1)
	result2 = one_loop([1,2,3,4,1]);
	print (result2)
