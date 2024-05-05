# The ability to pass arguments allows complexity to be hidden from the programmer. We have already seen straightforward cases of passing several values to methods as variables, but there is much more to Ruby's methods.

# Consider a case where a method is invoked from different portions of code with a variation in only one of the arguments. All other arguments remain constant. In such cases, it is useful to assign default values to the variables. It allows us to avoid passing a value for every argument, decreasing the chance of error.

# For example,

# def prefix(s, len=1)
#   s[0,len]
# end

# > prefix("Ruby", 3) # => "Rub"
# > prefix("Ruby")    # => "R"


def take(arr, skip = 1)
    arr[skip..-1]
  end

puts take([1, 2, 3], 1).inspect # => [2, 3]
puts take([1, 2, 3], 2).inspect # => [3]
puts take([1, 2, 3]).inspect    # => [2, 3]
