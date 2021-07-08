.model small
  disp macro msg
    lea dx,msg
    mov ah,09h
    int 21h
    endm

.data
   msg db 0dh,0ah,"Enter x: $"
   msg1 db 0dh,0ah,"Solution: $"

.code
   mov ax,@data
   mov ds,ax
   xor cx,cx
   disp msg
   mov ah,01h
   int 21h              
   mov ah,00h
   mov bl,al
   mul bl
   mul bl
   mov dl,09
   mul dl
   mov cx,ax
   mov al,bl
   mul bl
   mov dl,05
   mul dl
   add cx,ax
   sub cx,0002
   disp msg1
   mov al,cl
   aam
   mov bx,ax
   add bx,3030h
   mov ah,02h
   mov dl,bh
   int 21h
   mov dl,bl
   int 21h




   mov ah,4ch
   int 21h
   end

   

