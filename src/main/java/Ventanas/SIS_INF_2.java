/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;
import java.util.ArrayList;
import java.util.List;
import java.awt.Color;
import java.awt.Image;
import java.awt.MediaTracker;
import java.net.URL;
import java.util.Locale;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author CORE i5
 */
public class SIS_INF_2 extends javax.swing.JFrame {
    private List<Mueble> ListaMue = new ArrayList<>();
    private int index=0;
    private boolean Loggeado=false;
    private ImageIcon imagen;
    private Icon icono;
    private String TipoB="";
    private Query query=new Query();
    public SIS_INF_2() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.pintarImagen(this.lblImagenUser, "/Imagenes/user1.jpg");
        this.pintarImagen(this.lblImagenPolr, "/Imagenes/polar.png");
        ListaMue=query.obtenerSiguientes4Muebles(index);
        LLenarPanles();
        jTabbedPane2.setUI(null); // Asegúrate de reemplazar 'tabbedPane' con el nombre real de tu JTabbedPane        
    // Ajustar el tamaño del JFrame al contenido
    this.pack();
    }
public void setLabelText(JLabel label, String text) {
    int maxLength = 25;
    StringBuilder sb = new StringBuilder("<html>");
    String[] words = text.split(" ");
    StringBuilder line = new StringBuilder();

    for (String word : words) {
        if (line.length() + word.length() + 1 > maxLength) {
            sb.append(line).append("<br>");
            line.setLength(0);
        }
        if (line.length() > 0) {
            line.append(" ");
        }
        line.append(word);
    }
    sb.append(line).append("</html>");
    label.setText(sb.toString());
    }
    public void SettearIcono(JLabel imagen, String tipo){
        imagen.setIcon(null);
        imagen.setHorizontalAlignment(JLabel.CENTER); // Centra el icono horizontalmente
        imagen.setVerticalAlignment(JLabel.CENTER);
        String rutaBase = "/Imagenes/";
        String rutaImagen = "";
        switch (tipo.toLowerCase()) {
            case "cama":
                rutaImagen = rutaBase + "cama.jpg";
                break;
            case "ropero":
                rutaImagen = rutaBase + "ropero.jpg";
                break;
            case "escritorio":
                rutaImagen = rutaBase + "escritorio.jpg";
                break;
            case "comedor":
                rutaImagen = rutaBase + "comedor.jpg";
                break;
            case "mesa":
                rutaImagen = rutaBase + "comedor.jpg";
                break;
            case "silla":
                rutaImagen = rutaBase + "silla.jpg";
                break;
            case "sillom":
                rutaImagen = rutaBase + "sillom.jpg";
                break; 
            case "sofa":
                rutaImagen = rutaBase + "sofa.jpg";
                break;
            case "estante":
                rutaImagen = rutaBase + "estante.jpg";
                break;  
            default:
                System.out.println("Tipo de mueble no válido.");
                return;
        }
        // Ajustar el tamaño de la imagen y configurar el icono del JLabel
        try {
        ImageIcon icon = new ImageIcon(getClass().getResource(rutaImagen));
        if (icon.getImageLoadStatus() == MediaTracker.COMPLETE) {
            Image image = icon.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH); // Escalar imagen al tamaño del JLabel
            imagen.setIcon(new ImageIcon(image)); // Establecer imagen escalada como icono
        } else {
            System.out.println("La imagen no se encontró.");
        }
    } catch (Exception e) {
        System.out.println("Error al cargar la imagen: " + e.getMessage());
        e.printStackTrace();
    }
    }
    public void LLenarPanles(){
    setLabelText(this.lblDescripciontxt, ListaMue.get(0).getDescripcion());
    setLabelText(this.lblColorTxt, ListaMue.get(0).getModelo());
    setLabelText(this.lblMaterialtxt, ListaMue.get(0).getMaterial());
    setLabelText(this.lblTipotxt,ListaMue.get(0).getTipo());
    setLabelText(this.lblPreciotxt, ListaMue.get(0).getPrecio_Venta());
    SettearIcono(this.lblImagen, this.ListaMue.get(0).getTipo());
    // Para el segundo mueble
    setLabelText(this.lblDescripciontxt1, ListaMue.get(1).getDescripcion());
    setLabelText(this.lblColorTxt1, ListaMue.get(1).getModelo());
    setLabelText(this.lblMaterialtxt1, ListaMue.get(1).getMaterial());
    setLabelText(this.lblTipotxt1,ListaMue.get(1).getTipo());
    setLabelText(this.lblPreciotxt1, ListaMue.get(1).getPrecio_Venta());
    SettearIcono(this.lblImagen2, this.ListaMue.get(1).getTipo());

    // Para el tercer mueble
    setLabelText(this.lblDescripciontxt2, ListaMue.get(2).getDescripcion());
    setLabelText(this.lblColorTxt2, ListaMue.get(2).getModelo());
    setLabelText(this.lblMaterialtxt2, ListaMue.get(2).getMaterial());
    setLabelText(this.lblTipotxt2,ListaMue.get(2).getTipo());
    setLabelText(this.lblPreciotxt2, ListaMue.get(2).getPrecio_Venta());
    SettearIcono(this.lblImagen3, this.ListaMue.get(2).getTipo());

    // Para el cuarto mueble
    setLabelText(this.lblDescripciontxt3, ListaMue.get(3).getDescripcion());
    setLabelText(this.lblColorTxt3, ListaMue.get(3).getModelo());
    setLabelText(this.lblMaterialtxt3, ListaMue.get(3).getMaterial());
    setLabelText(this.lblTipotxt3,ListaMue.get(3).getTipo());
    setLabelText(this.lblPreciotxt3, ListaMue.get(3).getPrecio_Venta());
    SettearIcono(this.lblImagen4, this.ListaMue.get(3).getTipo());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        bnlMenu = new javax.swing.JPanel();
        lblUsuariotxt = new javax.swing.JLabel();
        lblImagenUser = new javax.swing.JLabel();
        pnlPaginaPrincipal = new javax.swing.JPanel();
        lblPaginaPrincipal = new javax.swing.JLabel();
        pnlCategoria = new javax.swing.JPanel();
        lblCategoria = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        pnlCuenta = new javax.swing.JPanel();
        lblCuentaTxt = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        pnlPPRIncipal = new javax.swing.JPanel();
        pnlFondo1 = new javax.swing.JPanel();
        pnlFondoImagen = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        pnlDescripcion = new javax.swing.JPanel();
        lblDescripcion = new javax.swing.JLabel();
        lblDescripciontxt = new javax.swing.JLabel();
        lblPreciotxt = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblMaterial = new javax.swing.JLabel();
        lblColorTxt = new javax.swing.JLabel();
        lblMaterialtxt = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblTipotxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlComprar = new javax.swing.JPanel();
        lblComprar = new javax.swing.JLabel();
        pnlFondo3 = new javax.swing.JPanel();
        pnlFondoImagen2 = new javax.swing.JPanel();
        lblImagen2 = new javax.swing.JLabel();
        pnlDescripcion1 = new javax.swing.JPanel();
        lblDescripcion1 = new javax.swing.JLabel();
        lblDescripciontxt1 = new javax.swing.JLabel();
        lblPreciotxt1 = new javax.swing.JLabel();
        lblColor1 = new javax.swing.JLabel();
        lblMaterial1 = new javax.swing.JLabel();
        lblColorTxt1 = new javax.swing.JLabel();
        lblMaterialtxt1 = new javax.swing.JLabel();
        lblTipo1 = new javax.swing.JLabel();
        lblTipotxt1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlComprar1 = new javax.swing.JPanel();
        lblComprar1 = new javax.swing.JLabel();
        pnlFondo4 = new javax.swing.JPanel();
        pnlFondoImagen3 = new javax.swing.JPanel();
        lblImagen3 = new javax.swing.JLabel();
        pnlDescripcion2 = new javax.swing.JPanel();
        lblDescripcion2 = new javax.swing.JLabel();
        lblDescripciontxt2 = new javax.swing.JLabel();
        lblPreciotxt2 = new javax.swing.JLabel();
        lblColor2 = new javax.swing.JLabel();
        lblMaterial2 = new javax.swing.JLabel();
        lblColorTxt2 = new javax.swing.JLabel();
        lblMaterialtxt2 = new javax.swing.JLabel();
        lblTipo2 = new javax.swing.JLabel();
        lblTipotxt2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnlComprar2 = new javax.swing.JPanel();
        lblComprar2 = new javax.swing.JLabel();
        pnlFondo5 = new javax.swing.JPanel();
        pnlFondoImagen4 = new javax.swing.JPanel();
        lblImagen4 = new javax.swing.JLabel();
        pnlDescripcion3 = new javax.swing.JPanel();
        lblDescripcion3 = new javax.swing.JLabel();
        lblDescripciontxt3 = new javax.swing.JLabel();
        lblPreciotxt3 = new javax.swing.JLabel();
        lblColor3 = new javax.swing.JLabel();
        lblMaterial3 = new javax.swing.JLabel();
        lblColorTxt3 = new javax.swing.JLabel();
        lblMaterialtxt3 = new javax.swing.JLabel();
        lblTipo3 = new javax.swing.JLabel();
        lblTipotxt3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlComprar3 = new javax.swing.JPanel();
        lblComprar3 = new javax.swing.JLabel();
        pnlPgCuenta = new javax.swing.JPanel();
        pnlContenido1 = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblCorreoTxt = new javax.swing.JLabel();
        textCorreo = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        pnlIngresar = new javax.swing.JPanel();
        lblIngresar = new javax.swing.JLabel();
        pnlCrearCuenta = new javax.swing.JPanel();
        txtCrearCuenta = new javax.swing.JLabel();
        PasswordFieldContraseña = new javax.swing.JPasswordField();
        pnlImagenPolr = new javax.swing.JPanel();
        lblImagenPolr = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        pnlBarraSuperio = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlFondo.setBackground(new java.awt.Color(153, 153, 153));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bnlMenu.setBackground(new java.awt.Color(153, 153, 153));

        lblUsuariotxt.setFont(new java.awt.Font("Roboto Condensed Light", 2, 14)); // NOI18N
        lblUsuariotxt.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuariotxt.setText("USUARIO O INVITADO");

        lblImagenUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        pnlPaginaPrincipal.setBackground(new java.awt.Color(102, 102, 102));
        pnlPaginaPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlPaginaPrincipalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlPaginaPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlPaginaPrincipalMouseExited(evt);
            }
        });

        lblPaginaPrincipal.setFont(new java.awt.Font("Roboto Condensed Light", 2, 14)); // NOI18N
        lblPaginaPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        lblPaginaPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPaginaPrincipal.setText("PAGINA PRINCIPAL");

        javax.swing.GroupLayout pnlPaginaPrincipalLayout = new javax.swing.GroupLayout(pnlPaginaPrincipal);
        pnlPaginaPrincipal.setLayout(pnlPaginaPrincipalLayout);
        pnlPaginaPrincipalLayout.setHorizontalGroup(
            pnlPaginaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPaginaPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlPaginaPrincipalLayout.setVerticalGroup(
            pnlPaginaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPaginaPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        pnlCategoria.setBackground(new java.awt.Color(102, 102, 102));
        pnlCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCategoriaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlCategoriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlCategoriaMouseExited(evt);
            }
        });

        lblCategoria.setBackground(new java.awt.Color(102, 102, 102));
        lblCategoria.setFont(new java.awt.Font("Roboto Condensed Light", 2, 14)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(255, 255, 255));
        lblCategoria.setText("CATEGORIA");

        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto SemiCondensed Light", 2, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CAMA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto SemiCondensed Light", 2, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ROPERO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Roboto SemiCondensed Light", 2, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ESCRITORIO");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Roboto SemiCondensed Light", 2, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("SOFA");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlCategoriaLayout = new javax.swing.GroupLayout(pnlCategoria);
        pnlCategoria.setLayout(pnlCategoriaLayout);
        pnlCategoriaLayout.setHorizontalGroup(
            pnlCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCategoriaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(pnlCategoriaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCategoriaLayout.setVerticalGroup(
            pnlCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pnlCuenta.setBackground(new java.awt.Color(102, 102, 102));
        pnlCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCuentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlCuentaMouseExited(evt);
            }
        });

        lblCuentaTxt.setFont(new java.awt.Font("Roboto Condensed Light", 2, 14)); // NOI18N
        lblCuentaTxt.setForeground(new java.awt.Color(255, 255, 255));
        lblCuentaTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCuentaTxt.setText("CUENTA");

        javax.swing.GroupLayout pnlCuentaLayout = new javax.swing.GroupLayout(pnlCuenta);
        pnlCuenta.setLayout(pnlCuentaLayout);
        pnlCuentaLayout.setHorizontalGroup(
            pnlCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCuentaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlCuentaLayout.setVerticalGroup(
            pnlCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCuentaTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bnlMenuLayout = new javax.swing.GroupLayout(bnlMenu);
        bnlMenu.setLayout(bnlMenuLayout);
        bnlMenuLayout.setHorizontalGroup(
            bnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bnlMenuLayout.createSequentialGroup()
                        .addComponent(lblImagenUser, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUsuariotxt)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(bnlMenuLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(bnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlPaginaPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        bnlMenuLayout.setVerticalGroup(
            bnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bnlMenuLayout.createSequentialGroup()
                .addGroup(bnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblImagenUser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuariotxt))
                .addGap(18, 18, 18)
                .addComponent(pnlPaginaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(pnlCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlFondo.add(bnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 230, 470));

        jTabbedPane2.setPreferredSize(new java.awt.Dimension(740, 650));

        pnlPPRIncipal.setPreferredSize(new java.awt.Dimension(730, 612));

        pnlFondo1.setBackground(new java.awt.Color(204, 204, 204));

        pnlFondoImagen.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout pnlFondoImagenLayout = new javax.swing.GroupLayout(pnlFondoImagen);
        pnlFondoImagen.setLayout(pnlFondoImagenLayout);
        pnlFondoImagenLayout.setHorizontalGroup(
            pnlFondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );
        pnlFondoImagenLayout.setVerticalGroup(
            pnlFondoImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoImagenLayout.createSequentialGroup()
                .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblDescripcion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblDescripcion.setText("DESCRIPCION:");

        lblPreciotxt.setBackground(new java.awt.Color(255, 255, 255));
        lblPreciotxt.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblPreciotxt.setForeground(new java.awt.Color(255, 102, 102));

        lblColor.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblColor.setText("Modelo");

        lblMaterial.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblMaterial.setText("Material:");

        lblColorTxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        lblMaterialtxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        lblTipo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblTipo.setText("Tipo:");

        lblTipotxt.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setText("Precio:");

        javax.swing.GroupLayout pnlDescripcionLayout = new javax.swing.GroupLayout(pnlDescripcion);
        pnlDescripcion.setLayout(pnlDescripcionLayout);
        pnlDescripcionLayout.setHorizontalGroup(
            pnlDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescripcionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripciontxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDescripcionLayout.createSequentialGroup()
                        .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblColorTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDescripcionLayout.createSequentialGroup()
                        .addComponent(lblMaterial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMaterialtxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDescripcionLayout.createSequentialGroup()
                        .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTipotxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDescripcionLayout.createSequentialGroup()
                        .addGroup(pnlDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescripcion)
                            .addGroup(pnlDescripcionLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPreciotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlDescripcionLayout.setVerticalGroup(
            pnlDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescripcionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescripciontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipo)
                    .addComponent(lblTipotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblColor)
                    .addComponent(lblColorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaterialtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDescripcionLayout.createSequentialGroup()
                        .addComponent(lblPreciotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGap(40, 40, 40))
        );

        pnlComprar.setBackground(new java.awt.Color(153, 153, 153));
        pnlComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlComprarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlComprarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlComprarMousePressed(evt);
            }
        });

        lblComprar.setBackground(new java.awt.Color(153, 153, 153));
        lblComprar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblComprar.setForeground(new java.awt.Color(255, 255, 255));
        lblComprar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblComprar.setText("COMPRAR");
        lblComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblComprarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblComprarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlComprarLayout = new javax.swing.GroupLayout(pnlComprar);
        pnlComprar.setLayout(pnlComprarLayout);
        pnlComprarLayout.setHorizontalGroup(
            pnlComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblComprar, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        pnlComprarLayout.setVerticalGroup(
            pnlComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblComprar, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlFondo1Layout = new javax.swing.GroupLayout(pnlFondo1);
        pnlFondo1.setLayout(pnlFondo1Layout);
        pnlFondo1Layout.setHorizontalGroup(
            pnlFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondo1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlFondoImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlFondo1Layout.setVerticalGroup(
            pnlFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondo1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, Short.MAX_VALUE)
                    .addGroup(pnlFondo1Layout.createSequentialGroup()
                        .addComponent(pnlFondoImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnlFondo3.setBackground(new java.awt.Color(204, 204, 204));

        pnlFondoImagen2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout pnlFondoImagen2Layout = new javax.swing.GroupLayout(pnlFondoImagen2);
        pnlFondoImagen2.setLayout(pnlFondoImagen2Layout);
        pnlFondoImagen2Layout.setHorizontalGroup(
            pnlFondoImagen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoImagen2Layout.createSequentialGroup()
                .addComponent(lblImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlFondoImagen2Layout.setVerticalGroup(
            pnlFondoImagen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoImagen2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagen2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
        );

        lblDescripcion1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblDescripcion1.setText("DESCRIPCION:");

        lblPreciotxt1.setBackground(new java.awt.Color(255, 255, 255));
        lblPreciotxt1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblPreciotxt1.setForeground(new java.awt.Color(255, 102, 102));

        lblColor1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblColor1.setText("Modelo");

        lblMaterial1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblMaterial1.setText("Material:");

        lblColorTxt1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        lblMaterialtxt1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        lblTipo1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblTipo1.setText("Tipo:");

        lblTipotxt1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Precio:");

        javax.swing.GroupLayout pnlDescripcion1Layout = new javax.swing.GroupLayout(pnlDescripcion1);
        pnlDescripcion1.setLayout(pnlDescripcion1Layout);
        pnlDescripcion1Layout.setHorizontalGroup(
            pnlDescripcion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescripcion1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDescripcion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripciontxt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDescripcion1Layout.createSequentialGroup()
                        .addComponent(lblDescripcion1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlDescripcion1Layout.createSequentialGroup()
                        .addComponent(lblTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTipotxt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDescripcion1Layout.createSequentialGroup()
                        .addComponent(lblColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblColorTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDescripcion1Layout.createSequentialGroup()
                        .addComponent(lblMaterial1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMaterialtxt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDescripcion1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPreciotxt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlDescripcion1Layout.setVerticalGroup(
            pnlDescripcion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescripcion1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDescripcion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescripciontxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDescripcion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipo1)
                    .addComponent(lblTipotxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDescripcion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblColor1)
                    .addComponent(lblColorTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDescripcion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaterial1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaterialtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDescripcion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblPreciotxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        pnlComprar1.setBackground(new java.awt.Color(153, 153, 153));
        pnlComprar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlComprar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlComprar1MouseExited(evt);
            }
        });

        lblComprar1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblComprar1.setForeground(new java.awt.Color(255, 255, 255));
        lblComprar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblComprar1.setText("COMPRAR");
        lblComprar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblComprar1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblComprar1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlComprar1Layout = new javax.swing.GroupLayout(pnlComprar1);
        pnlComprar1.setLayout(pnlComprar1Layout);
        pnlComprar1Layout.setHorizontalGroup(
            pnlComprar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblComprar1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        pnlComprar1Layout.setVerticalGroup(
            pnlComprar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblComprar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlFondo3Layout = new javax.swing.GroupLayout(pnlFondo3);
        pnlFondo3.setLayout(pnlFondo3Layout);
        pnlFondo3Layout.setHorizontalGroup(
            pnlFondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondo3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlFondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlFondoImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlComprar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDescripcion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlFondo3Layout.setVerticalGroup(
            pnlFondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondo3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlFondo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDescripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, Short.MAX_VALUE)
                    .addGroup(pnlFondo3Layout.createSequentialGroup()
                        .addComponent(pnlFondoImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlComprar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnlFondo4.setBackground(new java.awt.Color(204, 204, 204));

        pnlFondoImagen3.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout pnlFondoImagen3Layout = new javax.swing.GroupLayout(pnlFondoImagen3);
        pnlFondoImagen3.setLayout(pnlFondoImagen3Layout);
        pnlFondoImagen3Layout.setHorizontalGroup(
            pnlFondoImagen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlFondoImagen3Layout.setVerticalGroup(
            pnlFondoImagen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoImagen3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblDescripcion2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblDescripcion2.setText("DESCRIPCION:");

        lblPreciotxt2.setBackground(new java.awt.Color(255, 255, 255));
        lblPreciotxt2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblPreciotxt2.setForeground(new java.awt.Color(255, 102, 102));

        lblColor2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblColor2.setText("Modelo");

        lblMaterial2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblMaterial2.setText("Material:");

        lblColorTxt2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        lblMaterialtxt2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        lblTipo2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblTipo2.setText("Tipo:");

        lblTipotxt2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Precio:");

        javax.swing.GroupLayout pnlDescripcion2Layout = new javax.swing.GroupLayout(pnlDescripcion2);
        pnlDescripcion2.setLayout(pnlDescripcion2Layout);
        pnlDescripcion2Layout.setHorizontalGroup(
            pnlDescripcion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescripcion2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDescripcion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripciontxt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDescripcion2Layout.createSequentialGroup()
                        .addComponent(lblDescripcion2)
                        .addGap(0, 57, Short.MAX_VALUE))
                    .addGroup(pnlDescripcion2Layout.createSequentialGroup()
                        .addComponent(lblTipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTipotxt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDescripcion2Layout.createSequentialGroup()
                        .addComponent(lblColor2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblColorTxt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDescripcion2Layout.createSequentialGroup()
                        .addComponent(lblMaterial2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMaterialtxt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDescripcion2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPreciotxt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlDescripcion2Layout.setVerticalGroup(
            pnlDescripcion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescripcion2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDescripcion2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescripciontxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDescripcion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDescripcion2Layout.createSequentialGroup()
                        .addComponent(lblTipo2)
                        .addGap(10, 10, 10))
                    .addGroup(pnlDescripcion2Layout.createSequentialGroup()
                        .addComponent(lblTipotxt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(pnlDescripcion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblColor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblColorTxt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDescripcion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaterial2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaterialtxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDescripcion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDescripcion2Layout.createSequentialGroup()
                        .addComponent(lblPreciotxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGap(40, 40, 40))
        );

        pnlComprar2.setBackground(new java.awt.Color(153, 153, 153));
        pnlComprar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlComprar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlComprar2MouseExited(evt);
            }
        });

        lblComprar2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblComprar2.setForeground(new java.awt.Color(255, 255, 255));
        lblComprar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblComprar2.setText("COMPRAR");
        lblComprar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblComprar2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblComprar2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlComprar2Layout = new javax.swing.GroupLayout(pnlComprar2);
        pnlComprar2.setLayout(pnlComprar2Layout);
        pnlComprar2Layout.setHorizontalGroup(
            pnlComprar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblComprar2, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        pnlComprar2Layout.setVerticalGroup(
            pnlComprar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblComprar2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlFondo4Layout = new javax.swing.GroupLayout(pnlFondo4);
        pnlFondo4.setLayout(pnlFondo4Layout);
        pnlFondo4Layout.setHorizontalGroup(
            pnlFondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondo4Layout.createSequentialGroup()
                .addGroup(pnlFondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondo4Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(pnlFondoImagen3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondo4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlComprar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDescripcion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlFondo4Layout.setVerticalGroup(
            pnlFondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondo4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlFondo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDescripcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFondo4Layout.createSequentialGroup()
                        .addComponent(pnlFondoImagen3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlComprar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlFondo5.setBackground(new java.awt.Color(204, 204, 204));

        pnlFondoImagen4.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout pnlFondoImagen4Layout = new javax.swing.GroupLayout(pnlFondoImagen4);
        pnlFondoImagen4.setLayout(pnlFondoImagen4Layout);
        pnlFondoImagen4Layout.setHorizontalGroup(
            pnlFondoImagen4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagen4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlFondoImagen4Layout.setVerticalGroup(
            pnlFondoImagen4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoImagen4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImagen4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblDescripcion3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblDescripcion3.setText("DESCRIPCION:");

        lblPreciotxt3.setBackground(new java.awt.Color(255, 255, 255));
        lblPreciotxt3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblPreciotxt3.setForeground(new java.awt.Color(255, 102, 102));

        lblColor3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblColor3.setText("Modelo");

        lblMaterial3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblMaterial3.setText("Material:");

        lblColorTxt3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        lblMaterialtxt3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        lblTipo3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblTipo3.setText("Tipo:");

        lblTipotxt3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Precio:");

        javax.swing.GroupLayout pnlDescripcion3Layout = new javax.swing.GroupLayout(pnlDescripcion3);
        pnlDescripcion3.setLayout(pnlDescripcion3Layout);
        pnlDescripcion3Layout.setHorizontalGroup(
            pnlDescripcion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescripcion3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDescripcion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripciontxt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDescripcion3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTipotxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDescripcion3Layout.createSequentialGroup()
                        .addComponent(lblColor3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblColorTxt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDescripcion3Layout.createSequentialGroup()
                        .addComponent(lblMaterial3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMaterialtxt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDescripcion3Layout.createSequentialGroup()
                        .addGroup(pnlDescripcion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescripcion3)
                            .addComponent(lblTipo3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDescripcion3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPreciotxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlDescripcion3Layout.setVerticalGroup(
            pnlDescripcion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescripcion3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDescripcion3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescripciontxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDescripcion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipo3)
                    .addComponent(lblTipotxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDescripcion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDescripcion3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblColor3))
                    .addGroup(pnlDescripcion3Layout.createSequentialGroup()
                        .addComponent(lblColorTxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDescripcion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaterial3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaterialtxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDescripcion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDescripcion3Layout.createSequentialGroup()
                        .addComponent(lblPreciotxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addGap(40, 40, 40))
        );

        pnlComprar3.setBackground(new java.awt.Color(153, 153, 153));
        pnlComprar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlComprar3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlComprar3MouseExited(evt);
            }
        });

        lblComprar3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblComprar3.setForeground(new java.awt.Color(255, 255, 255));
        lblComprar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblComprar3.setText("COMPRAR");
        lblComprar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblComprar3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblComprar3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlComprar3Layout = new javax.swing.GroupLayout(pnlComprar3);
        pnlComprar3.setLayout(pnlComprar3Layout);
        pnlComprar3Layout.setHorizontalGroup(
            pnlComprar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblComprar3, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        pnlComprar3Layout.setVerticalGroup(
            pnlComprar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblComprar3, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlFondo5Layout = new javax.swing.GroupLayout(pnlFondo5);
        pnlFondo5.setLayout(pnlFondo5Layout);
        pnlFondo5Layout.setHorizontalGroup(
            pnlFondo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondo5Layout.createSequentialGroup()
                .addGroup(pnlFondo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondo5Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(pnlFondoImagen4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondo5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlComprar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlDescripcion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlFondo5Layout.setVerticalGroup(
            pnlFondo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondo5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlFondo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDescripcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFondo5Layout.createSequentialGroup()
                        .addComponent(pnlFondoImagen4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlComprar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlPPRIncipalLayout = new javax.swing.GroupLayout(pnlPPRIncipal);
        pnlPPRIncipal.setLayout(pnlPPRIncipalLayout);
        pnlPPRIncipalLayout.setHorizontalGroup(
            pnlPPRIncipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPPRIncipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPPRIncipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlFondo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlFondo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPPRIncipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlFondo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlFondo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlPPRIncipalLayout.setVerticalGroup(
            pnlPPRIncipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPPRIncipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlPPRIncipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlFondo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlFondo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPPRIncipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlFondo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlFondo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("tab1", pnlPPRIncipal);

        pnlMenu.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel5.setText("Iniciar sesión");

        lblCorreoTxt.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblCorreoTxt.setText("Correo:");

        textCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textCorreoMousePressed(evt);
            }
        });
        textCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCorreoActionPerformed(evt);
            }
        });

        lblContraseña.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblContraseña.setText("Contraseña:");

        pnlIngresar.setBackground(new java.awt.Color(102, 102, 102));
        pnlIngresar.setForeground(new java.awt.Color(255, 255, 255));
        pnlIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlIngresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlIngresarMouseExited(evt);
            }
        });

        lblIngresar.setFont(new java.awt.Font("Roboto", 2, 24)); // NOI18N
        lblIngresar.setForeground(new java.awt.Color(255, 255, 255));
        lblIngresar.setText("INGRESAR");

        javax.swing.GroupLayout pnlIngresarLayout = new javax.swing.GroupLayout(pnlIngresar);
        pnlIngresar.setLayout(pnlIngresarLayout);
        pnlIngresarLayout.setHorizontalGroup(
            pnlIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIngresarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblIngresar)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pnlIngresarLayout.setVerticalGroup(
            pnlIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIngresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIngresar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pnlCrearCuenta.setBackground(new java.awt.Color(102, 102, 102));
        pnlCrearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCrearCuentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlCrearCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlCrearCuentaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlCrearCuentaMousePressed(evt);
            }
        });

        txtCrearCuenta.setFont(new java.awt.Font("Roboto", 2, 24)); // NOI18N
        txtCrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        txtCrearCuenta.setText("CREAR CUENTA");

        javax.swing.GroupLayout pnlCrearCuentaLayout = new javax.swing.GroupLayout(pnlCrearCuenta);
        pnlCrearCuenta.setLayout(pnlCrearCuentaLayout);
        pnlCrearCuentaLayout.setHorizontalGroup(
            pnlCrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCrearCuentaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        pnlCrearCuentaLayout.setVerticalGroup(
            pnlCrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCrearCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCrearCuenta)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        PasswordFieldContraseña.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        PasswordFieldContraseña.setForeground(new java.awt.Color(204, 204, 204));
        PasswordFieldContraseña.setBorder(null);
        PasswordFieldContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordFieldContraseñaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PasswordFieldContraseñaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215))
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContraseña)
                            .addComponent(lblCorreoTxt))
                        .addContainerGap())))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(pnlCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(pnlIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(42, 42, 42)
                .addComponent(lblCorreoTxt)
                .addGap(18, 18, 18)
                .addComponent(textCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblContraseña)
                .addGap(18, 18, 18)
                .addComponent(PasswordFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(pnlIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(pnlCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Roboto Slab Thin", 2, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("POLAR TEAM");

        javax.swing.GroupLayout pnlImagenPolrLayout = new javax.swing.GroupLayout(pnlImagenPolr);
        pnlImagenPolr.setLayout(pnlImagenPolrLayout);
        pnlImagenPolrLayout.setHorizontalGroup(
            pnlImagenPolrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagenPolr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlImagenPolrLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlImagenPolrLayout.setVerticalGroup(
            pnlImagenPolrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImagenPolrLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImagenPolr, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlContenido1Layout = new javax.swing.GroupLayout(pnlContenido1);
        pnlContenido1.setLayout(pnlContenido1Layout);
        pnlContenido1Layout.setHorizontalGroup(
            pnlContenido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenido1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlImagenPolr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlContenido1Layout.setVerticalGroup(
            pnlContenido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenido1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContenido1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlImagenPolr, javax.swing.GroupLayout.PREFERRED_SIZE, 520, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlPgCuentaLayout = new javax.swing.GroupLayout(pnlPgCuenta);
        pnlPgCuenta.setLayout(pnlPgCuentaLayout);
        pnlPgCuentaLayout.setHorizontalGroup(
            pnlPgCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPgCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlContenido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPgCuentaLayout.setVerticalGroup(
            pnlPgCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPgCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlContenido1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab2", pnlPgCuenta);

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab3", content);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab4", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab5", jPanel2);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab6", jPanel7);

        pnlFondo.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 7, 730, 570));

        pnlBarraSuperio.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout pnlBarraSuperioLayout = new javax.swing.GroupLayout(pnlBarraSuperio);
        pnlBarraSuperio.setLayout(pnlBarraSuperioLayout);
        pnlBarraSuperioLayout.setHorizontalGroup(
            pnlBarraSuperioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        pnlBarraSuperioLayout.setVerticalGroup(
            pnlBarraSuperioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        pnlFondo.add(pnlBarraSuperio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 40));

        jButton1.setBackground(new java.awt.Color(242, 242, 242));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("siguiente");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnlFondo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 590, -1, -1));

        jButton2.setBackground(new java.awt.Color(242, 242, 242));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("atras");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        pnlFondo.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 590, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 988, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlPaginaPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPaginaPrincipalMouseEntered
        pnlPaginaPrincipal.setBackground(new Color(53,153,153));
    }//GEN-LAST:event_pnlPaginaPrincipalMouseEntered

    private void pnlPaginaPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPaginaPrincipalMouseExited
        pnlPaginaPrincipal.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_pnlPaginaPrincipalMouseExited

    private void pnlCategoriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCategoriaMouseEntered
        
    }//GEN-LAST:event_pnlCategoriaMouseEntered

    private void pnlCategoriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCategoriaMouseExited
        pnlCategoria.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_pnlCategoriaMouseExited

    private void pnlCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCuentaMouseEntered
        pnlCuenta.setBackground(new Color(53,153,153));
    }//GEN-LAST:event_pnlCuentaMouseEntered

    private void pnlCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCuentaMouseExited
        pnlCuenta.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_pnlCuentaMouseExited

    private void pnlComprarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlComprarMouseEntered
        pnlComprar.setBackground(new Color(53,153,153));
    }//GEN-LAST:event_pnlComprarMouseEntered

    private void pnlComprarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlComprarMouseExited
        pnlComprar.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_pnlComprarMouseExited

    private void pnlComprar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlComprar1MouseEntered
        pnlComprar1.setBackground(new Color(53,153,153));        // TODO add your handling code here:
    }//GEN-LAST:event_pnlComprar1MouseEntered

    private void pnlComprar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlComprar1MouseExited
        pnlComprar1.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_pnlComprar1MouseExited

    private void pnlComprar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlComprar2MouseEntered
        pnlComprar2.setBackground(new Color(53,153,153));        // TODO add your handling code here:
    }//GEN-LAST:event_pnlComprar2MouseEntered

    private void pnlComprar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlComprar2MouseExited
        pnlComprar2.setBackground(new Color(102,102,102));// TODO add your handling code here:
    }//GEN-LAST:event_pnlComprar2MouseExited

    private void pnlComprar3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlComprar3MouseEntered
        pnlComprar3.setBackground(new Color(53,153,153));        // TODO add your handling code here:
    }//GEN-LAST:event_pnlComprar3MouseEntered

    private void pnlComprar3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlComprar3MouseExited
        pnlComprar3.setBackground(new Color(102,102,102));// TODO add your handling code here:
    }//GEN-LAST:event_pnlComprar3MouseExited

    private void textCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textCorreoMousePressed
        if(textCorreo.getText().equals("Ingrese su nombre de usuario")){
            textCorreo.setText("");
            textCorreo.setForeground(Color.black);
        }
        if(String.valueOf(PasswordFieldContraseña.getPassword()).isEmpty()){
            PasswordFieldContraseña.setText("********");
            PasswordFieldContraseña.setForeground(Color.gray);
        }
    }//GEN-LAST:event_textCorreoMousePressed

    private void textCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCorreoActionPerformed

    private void pnlCrearCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCrearCuentaMouseClicked
          
  
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlCrearCuentaMouseClicked

    private void PasswordFieldContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordFieldContraseñaMouseClicked
            
    }//GEN-LAST:event_PasswordFieldContraseñaMouseClicked

    private void PasswordFieldContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordFieldContraseñaMousePressed
        if(String.valueOf(PasswordFieldContraseña.getPassword()).equals("********")){
            PasswordFieldContraseña.setText("");
            PasswordFieldContraseña.setForeground(Color.black);
        }

        if(textCorreo.getText().isEmpty()){
            textCorreo.setText("Ingrese su nombre de usuario");
            textCorreo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_PasswordFieldContraseñaMousePressed

    private void pnlPaginaPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPaginaPrincipalMouseClicked
       TipoB="";
       index=0;
       jTabbedPane2.setSelectedIndex(0); // TODO add your handling code here:
       this.jButton1.setVisible(true);
       this.jButton2.setVisible(true);
       ListaMue=query.obtenerSiguientes4Muebles(index);
       this.LLenarPanles();
       pnlFondo.repaint();
    }//GEN-LAST:event_pnlPaginaPrincipalMouseClicked

    private void pnlCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCuentaMouseClicked
        jTabbedPane2.setSelectedIndex(1);// TODO add your handling code here:
        this.jButton1.setVisible(false);
        this.jButton2.setVisible(false);
        pnlFondo.repaint();
    }//GEN-LAST:event_pnlCuentaMouseClicked

    private void pnlCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCategoriaMouseClicked
          // TODO add your handling code here:
    }//GEN-LAST:event_pnlCategoriaMouseClicked

    private void pnlIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlIngresarMouseEntered
        pnlIngresar.setBackground(new Color(53,153,153));// TODO add your handling code here:
    }//GEN-LAST:event_pnlIngresarMouseEntered

    private void pnlIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlIngresarMouseExited
        pnlIngresar.setBackground(new Color(102,102,102));// TODO add your handling code here:
    }//GEN-LAST:event_pnlIngresarMouseExited

    private void pnlCrearCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCrearCuentaMouseEntered
        pnlCrearCuenta.setBackground(new Color(53,153,153));// TODO add your handling code here:
    }//GEN-LAST:event_pnlCrearCuentaMouseEntered

    private void pnlCrearCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCrearCuentaMouseExited
        pnlCrearCuenta.setBackground(new Color(102,102,102));        // TODO add your handling code here:
    }//GEN-LAST:event_pnlCrearCuentaMouseExited

    private void pnlCrearCuentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCrearCuentaMousePressed
        RegistroCliente crc = new RegistroCliente ();
        crc.setVisible(true); // Hacerlo visible
        crc.setLocationRelativeTo(null);
        crc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        crc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               // TODO add your handling code here:
    }//GEN-LAST:event_pnlCrearCuentaMousePressed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
         index = 0;
         TipoB = "Cama";
         llenadaMA(TipoB);
    }//GEN-LAST:event_jPanel3MouseClicked
    public void llenadaMA(String tipoauz){
     index = 0;
        ListaMue = query.obtenerSiguientes4MueblesPorTipo(index, tipoauz);
        if (ListaMue == null) {
            ListaMue = new ArrayList<>();
        }
        if (ListaMue.isEmpty()) {
            for (int j = 0; j < 4; j++) {
                ListaMue.add(new Mueble(0,"vacio","vacio","vacio","vacio","vacio"));
            }
        } else if (ListaMue.size() < 4) {
            int itemsToAdd = 4 - ListaMue.size();
            for (int i = 0; i < itemsToAdd; i++) {
                ListaMue.add(new Mueble(0,"vacio","vacio","vacio","vacio","vacio"));
            }
        }
        LLenarPanles();
    }
    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        index = 0;
        TipoB = "Ropero";
        llenadaMA(TipoB);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        index = 0;
         TipoB = "Escritorio";
         llenadaMA(TipoB);           // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
         index = 0;
         TipoB = "Sofa";
         llenadaMA(TipoB);
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
            // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseEntered

    private void lblComprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprarMouseClicked
   

    }//GEN-LAST:event_lblComprarMouseClicked

    private void pnlComprarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlComprarMousePressed
                      // TODO add your handling code here:
    }//GEN-LAST:event_pnlComprarMousePressed

    private void lblComprarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprarMousePressed
        if(Loggeado==true){
        Compra1 cpc = new Compra1 ();
        cpc.setVisible(true); // Hacerlo visible
        cpc.setLocationRelativeTo(null);
            cpc.lblColorTxt.setText(this.lblColorTxt.getText());
            cpc.lblMaterialtxt.setText(this.lblMaterialtxt.getText());
            cpc.lblTipotxt.setText(this.lblTipotxt.getText());
            cpc.lblDescripciontxt.setText(this.lblDescripciontxt.getText());
            cpc.lblPreciotxt.setText(this.lblPreciotxt.getText());
            /*SettearIcono escala la imagen de un icono para cpc*/
            cpc.lblImagen.setIcon(new ImageIcon(cpc.SettearIcono(this.ListaMue.get(0).getTipo(), 241, 246)));
            cpc.lblImagen.setHorizontalAlignment(JLabel.CENTER); // Centra el icono horizontalmente
            cpc.lblImagen.setVerticalAlignment(JLabel.CENTER);  
        cpc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cpc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
            // TODO add your handling code here:// TODO add your handling code here:
    }//GEN-LAST:event_lblComprarMousePressed

    private void lblComprar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprar1MousePressed

    }//GEN-LAST:event_lblComprar1MousePressed

    private void lblComprar2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprar2MousePressed

    }//GEN-LAST:event_lblComprar2MousePressed

    private void lblComprar3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprar3MousePressed

    }//GEN-LAST:event_lblComprar3MousePressed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        if(index>=0){
        index=index+1;
        if(TipoB.equalsIgnoreCase("")){
        ListaMue=query.obtenerSiguientes4Muebles(index);
        }else{
        ListaMue=query.obtenerSiguientes4MueblesPorTipo(index, TipoB);
        }
        LLenarPanles();
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        if(index>=1){
        index=index-1;
        if(TipoB.equalsIgnoreCase("")){
        ListaMue=query.obtenerSiguientes4Muebles(index);
        }else{
        ListaMue=query.obtenerSiguientes4MueblesPorTipo(index, TipoB);
        }
        LLenarPanles();
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void pnlIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlIngresarMouseClicked
        // TODO add your handling code here:

         String u = (textCorreo.getText());
         String p = (PasswordFieldContraseña.getText());
         String NombreAdmin=query.buscarAdmim(u, p);
         String NameUsuario;
         int auxID=query.IDAdministrador(u, p);
         if(!NombreAdmin.equals("")){
            Principal llM = new Principal (NombreAdmin,auxID);
            llM.setVisible(true);
            dispose();  
         }else{
             NameUsuario=query.buscarUsuario(u, p);
             if(!NameUsuario.equalsIgnoreCase("")){
             this.lblUsuariotxt.setText("Usuario: " +NameUsuario);
             this.jTabbedPane2.setSelectedIndex(0);
             Loggeado=true;
             this.jButton1.setVisible(true);
             this.jButton2.setVisible(true);
             pnlFondo.repaint();
             }else{
            query.mostrarMensaje("Usuario o Contraseña no validos");
             }
         }
        
        
    }//GEN-LAST:event_pnlIngresarMouseClicked

    private void lblComprar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprar1MouseClicked
        // TODO add your handling code here:
        if(Loggeado==true){
        Compra1 cpc = new Compra1 ();
        cpc.setVisible(true); // Hacerlo visible
        cpc.setLocationRelativeTo(null);
            cpc.lblColorTxt.setText(this.lblColorTxt1.getText());
            cpc.lblMaterialtxt.setText(this.lblMaterialtxt1.getText());
            cpc.lblTipotxt.setText(this.lblTipotxt1.getText());
            cpc.lblDescripciontxt.setText(this.lblDescripciontxt1.getText());
            cpc.lblPreciotxt.setText(this.lblPreciotxt1.getText());
            cpc.lblImagen.setIcon(new ImageIcon(cpc.SettearIcono(this.ListaMue.get(1).getTipo(), 241, 246)));
            cpc.lblImagen.setHorizontalAlignment(JLabel.CENTER); // Centra el icono horizontalmente
            cpc.lblImagen.setVerticalAlignment(JLabel.CENTER);
        cpc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cpc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        }
    }//GEN-LAST:event_lblComprar1MouseClicked

    private void lblComprar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprar2MouseClicked
        // TODO add your handling code here:
        if(Loggeado==true){
                Compra1 cpc = new Compra1 ();
        cpc.setVisible(true); // Hacerlo visible
        cpc.setLocationRelativeTo(null);
        
            cpc.lblColorTxt.setText(this.lblColorTxt2.getText());
            cpc.lblMaterialtxt.setText(this.lblMaterialtxt2.getText());
            cpc.lblTipotxt.setText(this.lblTipotxt2.getText());
            cpc.lblDescripciontxt.setText(this.lblDescripciontxt2.getText());
            cpc.lblPreciotxt.setText(this.lblPreciotxt2.getText());
            cpc.lblImagen.setIcon(new ImageIcon(cpc.SettearIcono(this.ListaMue.get(2).getTipo(), 241, 246)));
            cpc.lblImagen.setHorizontalAlignment(JLabel.CENTER); // Centra el icono horizontalmente
            cpc.lblImagen.setVerticalAlignment(JLabel.CENTER);
        cpc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cpc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_lblComprar2MouseClicked

    private void lblComprar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprar3MouseClicked
        // TODO add your handling code here:
        if(Loggeado==true){
        Compra1 cpc = new Compra1 ();
        cpc.setVisible(true); // Hacerlo visible
        cpc.setLocationRelativeTo(null);
            cpc.lblColorTxt.setText(this.lblColorTxt3.getText());
            cpc.lblMaterialtxt.setText(this.lblMaterialtxt3.getText());
            cpc.lblTipotxt.setText(this.lblTipotxt3.getText());
            cpc.lblDescripciontxt.setText(this.lblDescripciontxt3.getText());
            cpc.lblPreciotxt.setText(this.lblPreciotxt3.getText());
            cpc.lblImagen.setIcon(new ImageIcon(cpc.SettearIcono(this.ListaMue.get(3).getTipo(), 241, 246)));
            cpc.lblImagen.setHorizontalAlignment(JLabel.CENTER); // Centra el icono horizontalmente
            cpc.lblImagen.setVerticalAlignment(JLabel.CENTER);
        cpc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cpc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
    }//GEN-LAST:event_lblComprar3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SIS_INF_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SIS_INF_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SIS_INF_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SIS_INF_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SIS_INF_2().setVisible(true);
            }
        });
    }
    private void pintarImagen(JLabel lbl, String ruta){
        URL imageUrl = getClass().getResource(ruta); // Carga desde el classpath
        if (imageUrl != null) {
            ImageIcon imagenS = new ImageIcon(imageUrl);
            ImageIcon iconoS = new ImageIcon(imagenS.getImage().getScaledInstance(
               lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH
            ));
            lbl.setIcon(iconoS);
        } else {
        System.out.println("Imagen no encontrada: " + ruta);
        }
    }
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordFieldContraseña;
    private javax.swing.JPanel bnlMenu;
    private javax.swing.JPanel content;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblColor1;
    private javax.swing.JLabel lblColor2;
    private javax.swing.JLabel lblColor3;
    private javax.swing.JLabel lblColorTxt;
    private javax.swing.JLabel lblColorTxt1;
    private javax.swing.JLabel lblColorTxt2;
    private javax.swing.JLabel lblColorTxt3;
    private javax.swing.JLabel lblComprar;
    private javax.swing.JLabel lblComprar1;
    private javax.swing.JLabel lblComprar2;
    private javax.swing.JLabel lblComprar3;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblCorreoTxt;
    private javax.swing.JLabel lblCuentaTxt;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDescripcion1;
    private javax.swing.JLabel lblDescripcion2;
    private javax.swing.JLabel lblDescripcion3;
    private javax.swing.JLabel lblDescripciontxt;
    private javax.swing.JLabel lblDescripciontxt1;
    private javax.swing.JLabel lblDescripciontxt2;
    private javax.swing.JLabel lblDescripciontxt3;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblImagen2;
    private javax.swing.JLabel lblImagen3;
    private javax.swing.JLabel lblImagen4;
    private javax.swing.JLabel lblImagenPolr;
    private javax.swing.JLabel lblImagenUser;
    private javax.swing.JLabel lblIngresar;
    private javax.swing.JLabel lblMaterial;
    private javax.swing.JLabel lblMaterial1;
    private javax.swing.JLabel lblMaterial2;
    private javax.swing.JLabel lblMaterial3;
    private javax.swing.JLabel lblMaterialtxt;
    private javax.swing.JLabel lblMaterialtxt1;
    private javax.swing.JLabel lblMaterialtxt2;
    private javax.swing.JLabel lblMaterialtxt3;
    private javax.swing.JLabel lblPaginaPrincipal;
    private javax.swing.JLabel lblPreciotxt;
    private javax.swing.JLabel lblPreciotxt1;
    private javax.swing.JLabel lblPreciotxt2;
    private javax.swing.JLabel lblPreciotxt3;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTipo1;
    private javax.swing.JLabel lblTipo2;
    private javax.swing.JLabel lblTipo3;
    private javax.swing.JLabel lblTipotxt;
    private javax.swing.JLabel lblTipotxt1;
    private javax.swing.JLabel lblTipotxt2;
    private javax.swing.JLabel lblTipotxt3;
    private javax.swing.JLabel lblUsuariotxt;
    private javax.swing.JPanel pnlBarraSuperio;
    private javax.swing.JPanel pnlCategoria;
    private javax.swing.JPanel pnlComprar;
    private javax.swing.JPanel pnlComprar1;
    private javax.swing.JPanel pnlComprar2;
    private javax.swing.JPanel pnlComprar3;
    private javax.swing.JPanel pnlContenido1;
    private javax.swing.JPanel pnlCrearCuenta;
    private javax.swing.JPanel pnlCuenta;
    private javax.swing.JPanel pnlDescripcion;
    private javax.swing.JPanel pnlDescripcion1;
    private javax.swing.JPanel pnlDescripcion2;
    private javax.swing.JPanel pnlDescripcion3;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlFondo1;
    private javax.swing.JPanel pnlFondo3;
    private javax.swing.JPanel pnlFondo4;
    private javax.swing.JPanel pnlFondo5;
    private javax.swing.JPanel pnlFondoImagen;
    private javax.swing.JPanel pnlFondoImagen2;
    private javax.swing.JPanel pnlFondoImagen3;
    private javax.swing.JPanel pnlFondoImagen4;
    private javax.swing.JPanel pnlImagenPolr;
    private javax.swing.JPanel pnlIngresar;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPPRIncipal;
    private javax.swing.JPanel pnlPaginaPrincipal;
    private javax.swing.JPanel pnlPgCuenta;
    private javax.swing.JTextField textCorreo;
    private javax.swing.JLabel txtCrearCuenta;
    // End of variables declaration//GEN-END:variables
}