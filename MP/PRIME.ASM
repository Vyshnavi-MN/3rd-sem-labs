
.model small
.data
.code
   mov ax,@data
   mov ds,ax

   mov ah,02h
   mov dl,50h
   int 21h
   mov dl,' '
   int 21h
   mov dl,33h
   int 21h
   mov dl,' '
   int 21h

   mov ah,00h
   mov cl,08h
   mov ch,00h
   mov dx,03h

   outloop:
      inc dx
      mov ch,02h
      mov bx,00h

      inloop:
         mov ax,dx
         div ch
         inc ch
         cmp ah,00h
         jne prime
         mov bh,01h
         jmp outloop

         prime:
            cmp ch,dl
            jl inloop
            jmp check

         print:
            mov ax,dx
            aam
            mov bx,ax
            add bx,3030h
            mov ah,02h
            mov dl,bh
            int 21h
            mov dl,bl
            int 21h
            mov dl,' '
             int 21h
             sub bx,3030h
             mov ax,bx
             aad
             mov dx,ax
             dec cl
             cmp cl,00h
             jne outloop

             check:
                cmp bh,00h
                je print

                mov ah,4ch
                int 21h
                end
