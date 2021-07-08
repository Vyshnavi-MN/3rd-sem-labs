.model small
   disp macro msg
     lea dx,msg
     mov ah,09h
     int 21h
     endm

.data
   arr db 11h,12h,36h,77h,79h
   n equ $-arr
   key db 11h
   msg1 db 0dh,0ah,"found$"
   msg2 db 0dh,0ah,"not found$"

.code
   mov ax,@data
   mov ds,ax

   mov ch,n-1
   mov cl,00

   again: mov si,offset arr
          xor ax,ax
          cmp cl,ch
          jnc fail
        ;  je next
          mov al,cl
          add al,ch
          shr al,01h
          mov bl,al
          xor ah,ah
          mov bp,ax
          mov al,ds:[bp][si]
          cmp al,key
          je success
          jc inflow
          mov ch,bl
          dec ch
          jmp again

   inflow: mov cl,bl
           inc cl
           jmp again

   success: disp msg1
            jmp final
    fail: disp msg2
    final: mov ah,4ch
           int 21h
           end


         

