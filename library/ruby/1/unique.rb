# One liner built in
def unique(str)
	return str.chars.uniq.size == str.size
end

# O(n) With additional data structure. More memory
def unique_ruby(str)
	# ASCII or Unicode 128 vs 256
	my_dictionary = {}
	str.chars.each do |char|
		if my_dictionary.key(char.to_s)
			return false
		end
		my_dictionary[char.to_s] =  true
	end
	return true
end

# O(nsquare) With no additional data structure
def unique_n_space(str)
	str.chars.each_with_index do |char,index|
		str.chars.each_with_index do |char2,index2|
			if (index != index2) && (char == char2)
				return false
			end
		end
	end
	return true
end