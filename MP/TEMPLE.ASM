.model small
   disp macro msg
     lea dx,msg
     mov ah,09h
     int 21h
     endm

.data
   str db 'TEMPLE$'
   len equ $-str

.code
   mov ax,@data
   mov ds,ax
   mov es,ax

   mov di,offset str
   mov al,'E'
   mov bl,'A'
   mov cx,len
   cld

   l1: scasb
       jne l2
       mov es:[di-1],bl
    l2: loop l1

    disp str
    mov ah,4ch
    int 21h
    end
