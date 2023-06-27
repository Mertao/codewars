def lcs(first_seq: str, second_seq: str) -> str:
    result: str = ''
    for indx in range(len(second_seq)):
        symbol = second_seq[indx]
        if symbol in first_seq:
            result += symbol
            symbol_index = first_seq.index(symbol)
            first_seq = first_seq[symbol_index+1:]
    return result
