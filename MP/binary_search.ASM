.model small
  display macro msg
  lea dx,msg
  mov ah,09h
  int 21h
  endm

.data
   arr db 02h,01h,14h,23h,15h
   key db 21h
   msg1 db 0dh,0ah,"found$";
   msg2 db 0dh,0ah,"not found$"

.code
   mov ax,@data
   mov ds,ax
   mov cl,00h
   mov si,offset arr

 again: mov al,[si]
        cmp al,key
        je success
        jnc next

 next: inc si
       inc cl
       cmp cl,04h
       jnc fail
       jc again

 fail: display msg2
       jmp over

 success: display msg1

over: mov ah,4ch
   int 21h
   end
