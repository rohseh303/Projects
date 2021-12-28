#########################################################################################
#  Created By:  Sehgal, Rohan
#               rsehgal1
#               14 November 2021
#
#  Assignment:  Lab 3: ASCII-risks (Asterisks)
#               CSE 12, Computer Systems and Assembly Language and Lab
#               UC Santa Cruz, Fall 2021
#
#  Description: This program is intended to produce an output that prints a pattern of 
#               numbers and stars.
#
#  Notes:       MARS IDE should be used to run this program.
#########################################################################################
# PSEUDOCODE:
# 1.  Print Prompt loop:
#
#             2.  print out prompt asking for height of pattern
#             3.  get user height input
#             4.  if user input number is less than 1:
#                     loop over again
#             5.  else complete loop and proceed onwards in program
#
# 6.  print out the number 1
# 7.  print a new line
#
# 8.  Print Pattern Loop:
#
#             9.  if user height input is greater than current loop counter:
#             10. continue on, else exit loop
#             11. print current height of pyramid
#             12. Print Single Line Pattern Loop:
#                         13.  if loop counter exceeds the current height pattern is being printed on, exit loop
#                         14.  else print the variable part
#                         15.  add one to loop counter
#                         16.  loop over again
#             17.  add one to loop counter
#             18.  print a new line
#             19.  loop back up to top
#
# 20. end program
#########################################################################################
# REGISTER USAGE:
# $zero: stores value zero
# $v0:   used for syscalls
# $a0:   used for syscalls
# $t0:   used to store the height of the patten
# $t1:   used to call a new line
# $t2:   loop counter
# $t3:   if/else value
# $t4:   if/else value
# $t5:   if/else value
# $t6:   tracks how many times the variable part has been printed
# $t7:   print first line, which is the number 1
# $t8:   prints current heigh program is printing pattern on
#########################################################################################

.data
	prompt: .asciiz "Enter the height of the pattern (must be greater than 0):\n"
	newLine: .asciiz "\n"
	invalid: .asciiz "Invalid Entry!\n"
	part: .asciiz "⊔*"

.text
#print out prompt
l:
	li $v0, 4
	la $a0, prompt
	syscall

	#get user input
	li $v0 5
	syscall

	#store user input
	move $t0, $v0
	
		slti $t4, $t0, 1
		beqz $t4 els
		li $v0, 4
		la $a0, invalid
		syscall
		
	j l
els:
	done:

#return line 1
li $t7, 1
move $a0, $t7
li $v0, 1
syscall

#return a new line
li $v0, 4
move $a0, $t1
la $a0, newLine
syscall

li $t2, 1
#display pyramid
loop1:
		#check if levels are complete
		sgt $t3, $t0, $t2
		beqz $t3 Else3
		
		#print level
		addiu $t8, $t2, 1
		move $a0, $t8
		li $v0, 1
		syscall
		
		li $t6, 0
		
		loop2:
				slt $t5, $t6, $t2
				beqz $t5 Else2
				
				#print u* once
				li $v0, 4
				move $a0, $t1
				la $a0, part
				syscall
				
				addiu $t6, $t6, 1
				j loop2
				
				Else2:
					done2:
		addiu $t2, $t2, 1
		
		#return a new line
		li $v0, 4
		move $a0, $t1
		la $a0, newLine
		syscall
		
		j loop1
			
	Else3:
		done3:

li $v0, 10
syscall
