.model small
.data
   n db 4

.code
   mov ax,@data
   mov ds,ax

   mov dl,n

   back1: push dx
          dec dl
          jnz back1

          mov al,01h
          mov ah,00h

   back2: pop dx
          mul dl
          cmp dl,n
          jne back2

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
