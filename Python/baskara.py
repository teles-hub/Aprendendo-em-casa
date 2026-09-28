print ('Eu vou calcular a forrmula de bhaskara para você')
while True:
   
    a = float(input ('Me diga o numero a ')) 
    b = float(input ('Me diga o numero b '))
    c = float(input ('Me diga o numero c '))
    delta = b**2 + (-4*a*c)
    x1 = (-b + delta**0.5) / (2*a)
    x2 = (-b - delta**0.5) / (2*a)
    print ('Seu delta é',delta)
    if delta < 0 : 
        print ('Essa contatem um delta negativo que é então ela acaba aqui')
    else: 
        print ('O resulado é {:.3f}, {:.3f}'.format( x1 , x2))
    c = input ('Quer que eu continue? (s/n) ')
    if c == 'n':
        break
