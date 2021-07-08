.model small
  disp macro msg
    lea dx,msg
    mov ah,09h
    int 21h
    endm

.data
   str1 db 10 dup(?)
   str2 db 10 dup(?)
   len1 db ?
   len2 db ?
   msg1 db 0ah,0dh,"Enter string 1: $"
   msg2 db 0ah,0dh,"Enter string 2: $"
   msg3 db 0ah,0dh,"Length of string 1: $"
   msg4 db 0ah,0dh,"Length of string 2: $"
   msg5 db 0ah,0dh,"Both the strings are same$"
   msg6 db 0ah,0dh,"Both the strings are different$"

.code
   mov ax,@data
   mov ds,ax
   mov si,00
   mov len1,00
   mov len2,00

   disp msg1
   back1: mov ah,01h
          int 21h
          cmp al,0dh
          je next1
          mov str1[si],al
          inc si
          inc len1
          jmp back1

   next1: disp msg2
          mov si,00

   back2: mov ah,01h
          int 21h
          cmp al,0dh
          je next2
          mov str2[si],al
          inc si
          inc len2
          jmp back2

    next2: disp msg3
           mov al,len1
           call len
           disp msg4
           mov al,len2
           call len

           mov cl,len1
           cmp cl,len2
           jne fail
           mov si,00
           dec cl
           mov ch,00
           xor cx,cx
           mov cl,len1

      l1:  mov al,str1[si]
           cmp al,str2[si]
           jne fail
           inc si
           cmp si,cx
           jc l1

           disp msg5
           jmp last

      fail: disp msg6

      last: mov ah,4ch
            int 21h

  len proc near
    aam
    mov bx,ax
    add bx,3030h
    mov ah,02h
    mov dl,bh
   int 21h
    mov dl,bl
    int 21h
   ret
   len endp

            end


  



