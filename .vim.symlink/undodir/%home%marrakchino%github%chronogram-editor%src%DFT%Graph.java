Vim�UnDo� �~}a,�³���L$�����)MD�>\8��d   =                                   X�\    _�                              ����                                                                                                                                                                                                                                                                                                                                                             X�\    �   ;   =              }�   :   <                  g.translate(-20, 20);�   9   ;          �        for (int i=0; i<dft.length; i++) g.fillRect((int)(i*space), this.getHeight()-(int)(dft[i]*heightScale), 1, (int)(dft[i]*heightScale));�   8   :              	g.setColor(Color.BLACK);�   7   9              	g.translate(20, -20);�   6   8              	// DFT�   5   7              		�   4   6              		// Vert scale�   3   5          d    		g.drawString((int)max+"",(int)(indexMax*space)+25,this.getHeight()-(int)(max*heightScale)-20);�   2   4              		g.drawString("mag",2,15);�   1   3          #    		g.drawLine(18, 20, 23, 20+5);�   0   2          #    		g.drawLine(18, 20, 13, 20+5);�   /   1          2    		g.drawLine(18, this.getHeight()-20, 18, 20);�   .   0              		// Vertical (mag)�   -   /          >    		g.drawString("N",this.getWidth()-10,this.getHeight()-5);�   ,   .          c    		g.drawLine(this.getWidth()-10, this.getHeight()-20, this.getWidth()-15, this.getHeight()-25);�   +   -          c    		g.drawLine(this.getWidth()-10, this.getHeight()-20, this.getWidth()-15, this.getHeight()-15);�   *   ,          S    		g.drawLine(18, this.getHeight()-20, this.getWidth()-10, this.getHeight()-20);�   )   +              		// Horizontal (f)�   (   *              		g.setColor(Color.RED);�   '   )              	// Coordinates�   &   (          4    	heightScale = (float)(this.getHeight()-50)/max;�   %   '              	}�   $   &              		}�   #   %              			tmp=max;�   "   $              			indexMax=i;�   !   #              		if (max!=tmp){�       "               		max=Math.max(max, dft[i]);�      !          &    	for (int i=0; i<dft.length; i++){�                 "    	float max=0,indexMax=0,tmp=0;�                    	// Search max�                    	float heightScale;�                		�                		�                	�                	�   
             	�      	          	�                 5��