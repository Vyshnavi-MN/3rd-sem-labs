.MODEL SMALL
.DATA
  ARR DW 01h,05h,02h,04h

.CODE
  MOV AX,@DATA
  MOV DS,AX
  MOV DX,04H
  DEC DX
 OUTER: MOV CX,DX
        MOV SI,OFFSET ARR

 AGAIN: MOV AX,[SI]
        CMP AX,[SI+2]
        JAE L1
        XCHG AX,[SI+2]
        XCHG AX,[SI]

  L1: INC SI
      INC SI
      DEC CX
      JNZ AGAIN
      DEC DX
      JNZ OUTER

   MOV AH,4CH
   INT 21H
   END


              
