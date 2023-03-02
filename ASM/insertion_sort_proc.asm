.text
#-------------------------------------------
# Procedure: insertion_sort
# Argument: 
#	$a0: Base address of the array
#       $a1: Number of array element
# Return:
#       None
# Notes: Implement insertion sort, base array 
#        at $a0 will be sorted after the routine
#	 is done.
#-------------------------------------------
insertion_sort:
	# Caller RTE store (TBD)
	addi	$sp, $sp, -20
	sw	$fp, 20($sp)
	sw	$ra, 16($sp)
	sw	$a0, 12($sp)
	sw	$a1, 8($sp)
	addi	$fp, $sp, 20
	# Implement insertion sort (TBD)
	addi 	$t0, $zero, 1	#$t0 = 1; i = 1
	ble	$a1, $t0, insertion_sort_end	#if length of array is empty or size of 1
outterLoop:
	add	$t1, $zero, $t0	#t1 = t0; j = i
innerLoop:
	mul	$t2, $t1, 4
	add	$t3, $a0, $t2
	lw	$t4, 0($t3)	#A[j]
	lw	$t5, -4($t3)	#A[j - 1]
	bgt	$t4, $t5, continue	# if t5 < t4 swap
	sw	$t4, -4($t3)
	sw	$t5, 0($t3)
	add	$t1, $t1, -1	#j = j -1
	bgt	$t1, $zero, innerLoop	#while j > 0
continue:
	add	$t0, $t0, 1	# i++
	blt	$t0, $a1, outterLoop	
insertion_sort_end:
	# Caller RTE restore (TBD)
	lw	$fp, 20($sp)
	lw	$ra, 16($sp)
	lw	$a0, 12($sp)
	lw	$a1, 8($sp)
	addi	$sp, $sp, 20
	# Return to Caller
	jr	$ra