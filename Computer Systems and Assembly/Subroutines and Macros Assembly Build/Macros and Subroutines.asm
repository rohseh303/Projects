######################################################
# Created by: Sehgal, Rohan 
# rsehgal1
# 30 November 2021 
# 
# Assignment: Lab 4: Functions and Graphics
# CSE 12, Computer Systems and Assembly Language 
# UC Santa Cruz, Fall 2021 
# 
# Description: This program uses subroutines and macros to output a bitmap display.
#
# Notes: This program is intended to be run from the MARS IDE
######################################################
# Macros made for you (you will need to use these)
######################################################

# Macro that stores the value in %reg on the stack 
#	and moves the stack pointer.
.macro push(%reg)
	subi $sp $sp 4
	sw %reg 0($sp)
.end_macro 

# Macro takes the value on the top of the stack and 
#	loads it into %reg then moves the stack pointer.
.macro pop(%reg)
	lw %reg 0($sp)
	addi $sp $sp 4	
.end_macro

#################################################
# Macros for you to fill in (you will need these)
#################################################

# Macro that takes as input coordinates in the format
#	(0x00XX00YY) and returns x and y separately.
# args: 
#	%input: register containing 0x00XX00YY
#	%x: register to store 0x000000XX in
#	%y: register to store 0x000000YY in
.macro getCoordinates(%input %x %y)
	srl %x, %input, 16
	andi %y, %input, 0x000000FF
.end_macro

# Macro that takes Coordinates in (%x,%y) where
#	%x = 0x000000XX and %y= 0x000000YY and
#	returns %output = (0x00XX00YY)
# args: 
#	%x: register containing 0x000000XX
#	%y: register containing 0x000000YY
#	%output: register to store 0x00XX00YY in
.macro formatCoordinates(%output %x %y)
	sll %output, %x, 16
	or %output, %y, %output
.end_macro 

# Macro that converts pixel coordinate to address
# 	  output = origin + 4 * (x + 128 * y)
# 	where origin = 0xFFFF0000 is the memory address
# 	corresponding to the point (0, 0), i.e. the memory
# 	address storing the color of the the top left pixel.
# args: 
#	%x: register containing 0x000000XX
#	%y: register containing 0x000000YY
#	%output: register to store memory address in
.macro getPixelAddress(%output %x %y)
	mul %output, %y, 128
	add %output, %x, %output
	mul %output, %output, 4
	addi %output, %output, 0xFFFF0000
.end_macro


.text
# prevent this file from being run as main
li $v0 10 
syscall

#~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
#  Subroutines defined below
#~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
#*****************************************************
# Clear_bitmap: Given a color, will fill the bitmap 
#	display with that color.
# -----------------------------------------------------
# Inputs:
#	$a0 = Color in format (0x00RRGGBB) 
# Outputs:
#	No register outputs
#*****************************************************
clear_bitmap: nop
	#running outer loop, which will transverse through all columns
	li $t1, 0
	loopX:
		bgt $t1, 127, doneX
		li $t2, 0
		#running inner loop, which will transverse through all rows
		loopY:
			bgt $t2, 127, doneY
			#fills bitmap display with that color
			getPixelAddress($t4, $t1, $t2)
			sw $a0, ($t4)
			addi $t2, $t2, 1
			j loopY
		doneY:
		addi $t1, $t1, 1
		j loopX
	doneX:
 	jr $ra

#*****************************************************
# draw_pixel: Given a coordinate in $a0, sets corresponding 
#	value in memory to the color given by $a1
# -----------------------------------------------------
#	Inputs:
#		$a0 = coordinates of pixel in format (0x00XX00YY)
#		$a1 = color of pixel in format (0x00RRGGBB)
#	Outputs:
#		No register outputs
#*****************************************************
draw_pixel: nop
	getCoordinates($a0, $t1,  $t2)
	getPixelAddress($t4, $t1, $t2)
	sw  $a1, ($t4)
	jr $ra
	
#*****************************************************
# get_pixel:
#  Given a coordinate, returns the color of that pixel	
#-----------------------------------------------------
#	Inputs:
#		$a0 = coordinates of pixel in format (0x00XX00YY)
#	Outputs:
#		Returns pixel color in $v0 in format (0x00RRGGBB)
#*****************************************************
get_pixel: nop
	getCoordinates($a0, $t1,  $t2)
	getPixelAddress($t4, $t1, $t2)
	lw $v0, ($t4)
	jr $ra

#*****************************************************
# draw_horizontal_line: Draws a horizontal line
# ----------------------------------------------------
# Inputs:
#	$a0 = y-coordinate in format (0x000000YY)
#	$a1 = color in format (0x00RRGGBB) 
# Outputs:
#	No register outputs
#*****************************************************
draw_horizontal_line: nop
	li $t1, 0
	#loop that transverses through all columns
	loop_Y_Horizontal:
		bgt $t1, 127, done_Y_Horizontal
		getPixelAddress($t5, $t1, $a0)
		sw $a1, ($t5)
		addi $t1, $t1, 1
		j loop_Y_Horizontal
	done_Y_Horizontal:
 		jr $ra


#*****************************************************
# draw_vertical_line: Draws a vertical line
# ----------------------------------------------------
# Inputs:
#	$a0 = x-coordinate in format (0x000000XX)
#	$a1 = color in format (0x00RRGGBB) 
# Outputs:
#	No register outputs
#*****************************************************
draw_vertical_line: nop
	li $t1, 0
	#loop that transverses through all rows
	loop_Y_Vertical:
		bgt $t1, 127, done_Y_Vertical
		getPixelAddress($t4, $a0, $t1)
		sw $a1, ($t4)
		addi $t1, $t1, 1
		j loop_Y_Vertical
	done_Y_Vertical:
 		jr $ra


#*****************************************************
# draw_crosshair: Draws a horizontal and a vertical 
#	line of given color which intersect at given (x, y).
#	The pixel at (x, y) should be the same color before 
#	and after running this function.
# -----------------------------------------------------
# Inputs:
#	$a0 = (x, y) coords of intersection in format (0x00XX00YY)
#	$a1 = color in format (0x00RRGGBB) 
# Outputs:
#	No register outputs
#*****************************************************
draw_crosshair: nop
	push($ra)
	
	# HINT: Store the pixel color at $a0 before drawing the horizontal and 
	# vertical lines, then afterwards, restore the color of the pixel at $a0 to 
	# give the appearance of the center being transparent.
	
	# Note: Remember to use push and pop in this function to save your t-registers
	# before calling any of the above subroutines.  Otherwise your t-registers 
	# may be overwritten.  
	
	# YOUR CODE HERE, only use t0-t7 registers (and a, v where appropriate)
	#storing original color
	#stores the color at coords of intersection
	jal get_pixel
	push($v0)
	push($a0)
	#store the x value of coords for draw_vertical
	getCoordinates($a0, $t5, $t6)
	push($t6)
	move $a0, $t5
	jal draw_vertical_line
	pop($t6)
	#store the y value of coords for draw_horizontal
	move $a0, $t6
	jal draw_horizontal_line
	pop($a0)
	
	pop($a1)
	#use draw pixel to put original color where crosshair is
	jal draw_pixel
	
	
	
	# HINT: at this point, $ra has changed (and you're likely stuck in an infinite loop). 
	# Add a pop before the below jump return (and push somewhere above) to fix this.
	pop($ra)
	jr $ra
