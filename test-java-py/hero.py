'''
Heroes beta-0.1
ch
2018-01-22
'''
hp=100
print('Welcome Heros World!')
print("|the world is like this ####,'a' for left,'d' for right|")
name=input('input your name :')
if not name:
    name='player01'

usermsg=[name,hp]# 链表

print('your name is',usermsg[0],'HP is',usermsg[1])
print("now choose your advent:####,'a' for left,'d' for right")
userinput=input()
if userinput=='a':
    print("you are here #*###")
else:
     print("you are here ###*#")


