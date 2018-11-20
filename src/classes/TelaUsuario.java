package classes;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 
 * 
 * Jefferson Carvalho
 * jeffersoncarvalho60@outlook.com
 * 
 */

public class TelaUsuario extends javax.swing.JFrame {

    Chamado dadosChamado = new Chamado();
    Aviso dadosAviso = new Aviso();
    Usuario dadosUsuario = new Usuario();
    public static DefaultTableModel mdlUltimosChamados;
    public static DefaultTableModel mdlUltimosAvisos;

    public TelaUsuario(Usuario tmpUsuario) {
        initComponents();
        this.setLocationRelativeTo(null);

        dadosUsuario = tmpUsuario;

        preencheBarras(dadosUsuario);

        setColor(btnAvisos);

        mdlUltimosChamados = (DefaultTableModel) tblUltimosChamados.getModel();
        mdlUltimosAvisos = (DefaultTableModel) tblAvisos.getModel();

        tblUltimosChamados.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt) {
                String tmpCodigo;

                tmpCodigo = tblUltimosChamados.getValueAt(tblUltimosChamados.getSelectedRow(), 0).toString();

                try {
                    Chamado tmpChamado = new Chamado();

                    tmpChamado = ChamadoDAO.consultaChamado(tmpCodigo);

                    System.out.println(tmpChamado.getDescricao());

                    txtDescricao2.setText(tmpChamado.getDescricao());
                } catch (Exception erro) {
                    JOptionPane.showMessageDialog(null, erro.getMessage());
                }
            }

        });

        tblAvisos.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt) {
                String tmpCodigo;

                tmpCodigo = tblAvisos.getValueAt(tblAvisos.getSelectedRow(), 0).toString();

                try {
                    Aviso tmpAviso = new Aviso();

                    tmpAviso = AvisoDAO.consultaAviso(tmpCodigo);

                    System.out.println(tmpAviso.getDescricao());

                    txtDescricaoAviso.setText(tmpAviso.getDescricao());
                } catch (Exception erro) {
                    JOptionPane.showMessageDialog(null, erro.getMessage());
                }
            }

        });

        carregaTabelaAvisos();

    } //fechando construtor

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        btnNovoChamado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAvisos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        btnSair = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnSeusChamados = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        frameChamado = new javax.swing.JInternalFrame();
        ((BasicInternalFrameUI)frameChamado.getUI()).setNorthPane(null);
        frameChamado.setBorder(null);
        pnlChamado = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtSubCat = new javax.swing.JTextField();
        jcbCategoria = new javax.swing.JComboBox<>();
        jcbSetor = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txtDescricao = new javax.swing.JTextField();
        btnEnviar = new java.awt.Button();
        pnlBarra = new javax.swing.JPanel();
        lblUsuario1 = new javax.swing.JLabel();
        lblUsuario11 = new javax.swing.JLabel();
        lblID1 = new javax.swing.JLabel();
        lblID11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        frameAvisos = new javax.swing.JInternalFrame();
        ((BasicInternalFrameUI)frameAvisos.getUI()).setNorthPane(null);
        frameChamado.setBorder(null);
        pnlAvisos = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAvisos = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        txtDescricaoAviso = new javax.swing.JTextField();
        pnlBarra3 = new javax.swing.JPanel();
        lblUsuarioB = new javax.swing.JLabel();
        lblUsuarioBB = new javax.swing.JLabel();
        lblIDB = new javax.swing.JLabel();
        lblIDBB = new javax.swing.JLabel();
        frameUltimosChamados = new javax.swing.JInternalFrame();
        ((BasicInternalFrameUI)frameUltimosChamados.getUI()).setNorthPane(null);
        frameChamado.setBorder(null);
        pnlChamado1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUltimosChamados = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        txtDescricao2 = new javax.swing.JTextField();
        pnlBarra4 = new javax.swing.JPanel();
        lblUsuario8 = new javax.swing.JLabel();
        lblUsuario88 = new javax.swing.JLabel();
        lblID8 = new javax.swing.JLabel();
        lblID88 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        pnlPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(860, 540));

        pnlMenu.setBackground(new java.awt.Color(0, 120, 51));

        btnNovoChamado.setBackground(new java.awt.Color(0, 153, 50));
        btnNovoChamado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNovoChamadoMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/round-add-button.png"))); // NOI18N
        jLabel1.setText("    Novo chamado");

        javax.swing.GroupLayout btnNovoChamadoLayout = new javax.swing.GroupLayout(btnNovoChamado);
        btnNovoChamado.setLayout(btnNovoChamadoLayout);
        btnNovoChamadoLayout.setHorizontalGroup(
            btnNovoChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnNovoChamadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnNovoChamadoLayout.setVerticalGroup(
            btnNovoChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNovoChamadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAvisos.setBackground(new java.awt.Color(0, 153, 50));
        btnAvisos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAvisosMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/warning (1).png"))); // NOI18N
        jLabel3.setText("    Avisos");

        javax.swing.GroupLayout btnAvisosLayout = new javax.swing.GroupLayout(btnAvisos);
        btnAvisos.setLayout(btnAvisosLayout);
        btnAvisosLayout.setHorizontalGroup(
            btnAvisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAvisosLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnAvisosLayout.setVerticalGroup(
            btnAvisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAvisosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("User");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fix Me !!!");

        btnSair.setBackground(new java.awt.Color(0, 153, 50));
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSairMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        jLabel6.setText("    Sair");

        javax.swing.GroupLayout btnSairLayout = new javax.swing.GroupLayout(btnSair);
        btnSair.setLayout(btnSairLayout);
        btnSairLayout.setHorizontalGroup(
            btnSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSairLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnSairLayout.setVerticalGroup(
            btnSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSairLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSeusChamados.setBackground(new java.awt.Color(0, 153, 50));
        btnSeusChamados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSeusChamadosMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        jLabel2.setText("    Chamados");

        javax.swing.GroupLayout btnSeusChamadosLayout = new javax.swing.GroupLayout(btnSeusChamados);
        btnSeusChamados.setLayout(btnSeusChamadosLayout);
        btnSeusChamadosLayout.setHorizontalGroup(
            btnSeusChamadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSeusChamadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnSeusChamadosLayout.setVerticalGroup(
            btnSeusChamadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSeusChamadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNovoChamado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAvisos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSeusChamados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(btnNovoChamado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSeusChamados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAvisos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayout(new java.awt.FlowLayout());

        frameChamado.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        frameChamado.setPreferredSize(new java.awt.Dimension(627, 527));
        frameChamado.setVisible(false);

        pnlChamado.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(0, 153, 51));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Preencha os detalhes do chamado:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 11, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Meiryo UI", 0, 18)); // NOI18N
        jLabel8.setText("Nome:");

        jLabel9.setFont(new java.awt.Font("Meiryo UI", 0, 18)); // NOI18N
        jLabel9.setText("Email:");

        jLabel10.setFont(new java.awt.Font("Meiryo UI", 0, 18)); // NOI18N
        jLabel10.setText("Categoria:");

        jLabel11.setFont(new java.awt.Font("Meiryo UI", 0, 18)); // NOI18N
        jLabel11.setText("Sub-categoria:");

        jLabel12.setFont(new java.awt.Font("Meiryo UI", 0, 18)); // NOI18N
        jLabel12.setText("Setor:");

        jLabel13.setFont(new java.awt.Font("Meiryo UI", 0, 18)); // NOI18N
        jLabel13.setText("Descrição:");

        txtSubCat.setBorder(null);

        jcbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hardware", "Software", "Redes" }));

        jcbSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TI", "Contabilidade", "Recursos Humanos" }));

        txtDescricao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        btnEnviar.setBackground(new java.awt.Color(0, 153, 51));
        btnEnviar.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setLabel("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        pnlBarra.setBackground(new java.awt.Color(255, 255, 255));

        lblUsuario1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        lblUsuario1.setText("Usuário:");

        lblUsuario11.setFont(new java.awt.Font("Meiryo UI", 0, 16)); // NOI18N
        lblUsuario11.setText("jLabel19");

        lblID1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        lblID1.setText("ID:");

        lblID11.setFont(new java.awt.Font("Meiryo UI", 0, 16)); // NOI18N
        lblID11.setText("jLabel19");

        javax.swing.GroupLayout pnlBarraLayout = new javax.swing.GroupLayout(pnlBarra);
        pnlBarra.setLayout(pnlBarraLayout);
        pnlBarraLayout.setHorizontalGroup(
            pnlBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBarraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario11)
                .addGap(60, 60, 60)
                .addComponent(lblID1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblID11)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        pnlBarraLayout.setVerticalGroup(
            pnlBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBarraLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(pnlBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario1)
                    .addComponent(lblUsuario11)
                    .addComponent(lblID1)
                    .addComponent(lblID11)))
        );

        jLabel16.setFont(new java.awt.Font("Meiryo UI", 0, 24)); // NOI18N
        jLabel16.setText("x");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel16MousePressed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Meiryo UI", 0, 18)); // NOI18N
        lblNome.setText("jLabel14");

        lblEmail.setFont(new java.awt.Font("Meiryo UI", 0, 18)); // NOI18N
        lblEmail.setText("jLabel15");

        javax.swing.GroupLayout pnlChamadoLayout = new javax.swing.GroupLayout(pnlChamado);
        pnlChamado.setLayout(pnlChamadoLayout);
        pnlChamadoLayout.setHorizontalGroup(
            pnlChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlChamadoLayout.createSequentialGroup()
                .addComponent(pnlBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlChamadoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlChamadoLayout.createSequentialGroup()
                        .addGroup(pnlChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlChamadoLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblEmail))
                            .addGroup(pnlChamadoLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNome))
                            .addGroup(pnlChamadoLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(93, 93, 93)
                                .addComponent(jLabel11))
                            .addComponent(jLabel13)
                            .addGroup(pnlChamadoLayout.createSequentialGroup()
                                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlChamadoLayout.createSequentialGroup()
                                .addGroup(pnlChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jcbSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32)
                                .addGroup(pnlChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator5)
                                    .addComponent(txtSubCat, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlChamadoLayout.createSequentialGroup()
                        .addGroup(pnlChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlChamadoLayout.setVerticalGroup(
            pnlChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChamadoLayout.createSequentialGroup()
                .addGroup(pnlChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblEmail))
                .addGap(5, 5, 5)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(6, 6, 6)
                .addGroup(pnlChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlChamadoLayout.createSequentialGroup()
                        .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12))
                    .addGroup(pnlChamadoLayout.createSequentialGroup()
                        .addComponent(txtSubCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(jcbSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(pnlChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frameChamadoLayout = new javax.swing.GroupLayout(frameChamado.getContentPane());
        frameChamado.getContentPane().setLayout(frameChamadoLayout);
        frameChamadoLayout.setHorizontalGroup(
            frameChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlChamado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frameChamadoLayout.setVerticalGroup(
            frameChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlChamado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane1.add(frameChamado);

        frameAvisos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        frameAvisos.setPreferredSize(new java.awt.Dimension(627, 527));
        frameAvisos.setVisible(true);

        pnlAvisos.setBackground(new java.awt.Color(255, 255, 255));
        pnlAvisos.setPreferredSize(new java.awt.Dimension(619, 500));

        jPanel10.setBackground(new java.awt.Color(0, 153, 51));

        jLabel27.setBackground(new java.awt.Color(0, 0, 0));
        jLabel27.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Últimos Avisos:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.DEFAULT_SIZE, 11, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel36.setFont(new java.awt.Font("Meiryo UI", 0, 24)); // NOI18N
        jLabel36.setText("x");
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel36MousePressed(evt);
            }
        });

        tblAvisos.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N
        tblAvisos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Assunto", "Data", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAvisos);
        if (tblAvisos.getColumnModel().getColumnCount() > 0) {
            tblAvisos.getColumnModel().getColumn(0).setResizable(false);
            tblAvisos.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblAvisos.getColumnModel().getColumn(1).setResizable(false);
            tblAvisos.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        jLabel17.setFont(new java.awt.Font("Meiryo UI", 0, 18)); // NOI18N
        jLabel17.setText("Clique em um aviso para ver a descrição");

        pnlBarra3.setBackground(new java.awt.Color(255, 255, 255));

        lblUsuarioB.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        lblUsuarioB.setText("Usuário:");

        lblUsuarioBB.setFont(new java.awt.Font("Meiryo UI", 0, 16)); // NOI18N
        lblUsuarioBB.setText("jLabel19");

        lblIDB.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        lblIDB.setText("ID:");

        lblIDBB.setFont(new java.awt.Font("Meiryo UI", 0, 16)); // NOI18N
        lblIDBB.setText("jLabel19");

        javax.swing.GroupLayout pnlBarra3Layout = new javax.swing.GroupLayout(pnlBarra3);
        pnlBarra3.setLayout(pnlBarra3Layout);
        pnlBarra3Layout.setHorizontalGroup(
            pnlBarra3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBarra3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuarioB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuarioBB)
                .addGap(60, 60, 60)
                .addComponent(lblIDB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblIDBB)
                .addContainerGap(139, Short.MAX_VALUE))
        );
        pnlBarra3Layout.setVerticalGroup(
            pnlBarra3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBarra3Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(pnlBarra3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuarioB)
                    .addComponent(lblUsuarioBB)
                    .addComponent(lblIDB)
                    .addComponent(lblIDBB)))
        );

        javax.swing.GroupLayout pnlAvisosLayout = new javax.swing.GroupLayout(pnlAvisos);
        pnlAvisos.setLayout(pnlAvisosLayout);
        pnlAvisosLayout.setHorizontalGroup(
            pnlAvisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAvisosLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(pnlAvisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                    .addComponent(jSeparator6)
                    .addComponent(txtDescricaoAviso))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(pnlAvisosLayout.createSequentialGroup()
                .addComponent(pnlBarra3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlAvisosLayout.setVerticalGroup(
            pnlAvisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAvisosLayout.createSequentialGroup()
                .addGroup(pnlAvisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(pnlBarra3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDescricaoAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frameAvisosLayout = new javax.swing.GroupLayout(frameAvisos.getContentPane());
        frameAvisos.getContentPane().setLayout(frameAvisosLayout);
        frameAvisosLayout.setHorizontalGroup(
            frameAvisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAvisos, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );
        frameAvisosLayout.setVerticalGroup(
            frameAvisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAvisos, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );

        jDesktopPane1.add(frameAvisos);

        frameUltimosChamados.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        frameUltimosChamados.setPreferredSize(new java.awt.Dimension(627, 527));
        frameUltimosChamados.setVisible(false);

        pnlChamado1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(0, 153, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Chamados - Filtrar por: ");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 330, -1));
        jPanel5.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, 560, 11));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos os chamados", "Seus Chamados", "Chamados Concluídos" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel5.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 160, 30));

        jLabel28.setFont(new java.awt.Font("Meiryo UI", 0, 24)); // NOI18N
        jLabel28.setText("x");
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel28MousePressed(evt);
            }
        });

        tblUltimosChamados.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N
        tblUltimosChamados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Assunto", "Data", "Hora", "Status", "Prazo"
            }
        ));
        jScrollPane2.setViewportView(tblUltimosChamados);
        if (tblUltimosChamados.getColumnModel().getColumnCount() > 0) {
            tblUltimosChamados.getColumnModel().getColumn(0).setMinWidth(0);
            tblUltimosChamados.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblUltimosChamados.getColumnModel().getColumn(3).setPreferredWidth(40);
        }

        jLabel29.setFont(new java.awt.Font("Meiryo UI", 0, 18)); // NOI18N
        jLabel29.setText("Clique em um chamado para ver a descrição:");

        txtDescricao2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        pnlBarra4.setBackground(new java.awt.Color(255, 255, 255));

        lblUsuario8.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        lblUsuario8.setText("Usuário:");

        lblUsuario88.setFont(new java.awt.Font("Meiryo UI", 0, 16)); // NOI18N
        lblUsuario88.setText("jLabel19");

        lblID8.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        lblID8.setText("ID:");

        lblID88.setFont(new java.awt.Font("Meiryo UI", 0, 16)); // NOI18N
        lblID88.setText("jLabel19");

        javax.swing.GroupLayout pnlBarra4Layout = new javax.swing.GroupLayout(pnlBarra4);
        pnlBarra4.setLayout(pnlBarra4Layout);
        pnlBarra4Layout.setHorizontalGroup(
            pnlBarra4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBarra4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuario8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario88)
                .addGap(60, 60, 60)
                .addComponent(lblID8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblID88)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        pnlBarra4Layout.setVerticalGroup(
            pnlBarra4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBarra4Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(pnlBarra4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario8)
                    .addComponent(lblUsuario88)
                    .addComponent(lblID8)
                    .addComponent(lblID88)))
        );

        javax.swing.GroupLayout pnlChamado1Layout = new javax.swing.GroupLayout(pnlChamado1);
        pnlChamado1.setLayout(pnlChamado1Layout);
        pnlChamado1Layout.setHorizontalGroup(
            pnlChamado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChamado1Layout.createSequentialGroup()
                .addComponent(pnlBarra4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlChamado1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlChamado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlChamado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDescricao2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlChamado1Layout.setVerticalGroup(
            pnlChamado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChamado1Layout.createSequentialGroup()
                .addGroup(pnlChamado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(pnlBarra4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(txtDescricao2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frameUltimosChamadosLayout = new javax.swing.GroupLayout(frameUltimosChamados.getContentPane());
        frameUltimosChamados.getContentPane().setLayout(frameUltimosChamadosLayout);
        frameUltimosChamadosLayout.setHorizontalGroup(
            frameUltimosChamadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlChamado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frameUltimosChamadosLayout.setVerticalGroup(
            frameUltimosChamadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlChamado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jDesktopPane1.add(frameUltimosChamados);

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
            .addComponent(pnlMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void carregaTabelaChamados(int tmpFiltro) {

        while (mdlUltimosChamados.getRowCount() > 0) {
            mdlUltimosChamados.removeRow(0);
        }

        try {
            List<Chamado> vetorChamado = new ArrayList<Chamado>();

            if (tmpFiltro == 0) {

                vetorChamado = ChamadoDAO.listaChamados(0, 0);

            } else if (tmpFiltro == 1) {

                vetorChamado = ChamadoDAO.listaChamados(1, dadosUsuario.getId());

            } else if (tmpFiltro == 2) {

                vetorChamado = ChamadoDAO.listaChamadosConcluidos();
            }

            for (Chamado chamadoAtual : vetorChamado) {
                String dadosChamado[] = new String[6];

                dadosChamado[0] = chamadoAtual.getID();
                dadosChamado[1] = chamadoAtual.getSubCategoria();
                dadosChamado[2] = chamadoAtual.getData();
                dadosChamado[3] = chamadoAtual.getHora();
                dadosChamado[4] = chamadoAtual.getStatus();
                dadosChamado[5] = chamadoAtual.getPrioridade();

                mdlUltimosChamados.addRow(dadosChamado);

            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
    }

    public void carregaTabelaAvisos() {

        while (mdlUltimosAvisos.getRowCount() > 0) {
            mdlUltimosAvisos.removeRow(0);
        }

        try {
            List<Aviso> vetorAviso = new ArrayList<Aviso>();

            vetorAviso = AvisoDAO.listaAvisos();

            for (Aviso avisoAtual : vetorAviso) {
                String dadosAviso[] = new String[4];

                dadosAviso[0] = Integer.toString(avisoAtual.getId());
                dadosAviso[1] = avisoAtual.getAssunto();
                dadosAviso[2] = avisoAtual.getData();
                dadosAviso[3] = avisoAtual.getHora();

                mdlUltimosAvisos.addRow(dadosAviso);

            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
    }

    public void preencheBarras(Usuario tmpUsuario) {
        lblUsuario11.setText(tmpUsuario.getNome());
        lblID11.setText(Integer.toString(tmpUsuario.getId()));

        lblUsuarioBB.setText(tmpUsuario.getNome());
        lblIDBB.setText(Integer.toString(tmpUsuario.getId()));

        lblUsuario88.setText(tmpUsuario.getNome());
        lblID88.setText(Integer.toString(tmpUsuario.getId()));

        lblNome.setText(tmpUsuario.getNome());
        lblEmail.setText(tmpUsuario.getEmail());
    }

    public void gravaChamado() {

        dadosChamado.setCategoria(jcbCategoria.getSelectedItem().toString());
        dadosChamado.setSubCategoria(txtSubCat.getText());
        dadosChamado.setSetor(jcbSetor.getSelectedItem().toString());
        dadosChamado.setDescricao(txtDescricao.getText());
        dadosChamado.setData(dadosChamado.getDataHora(0)); // 0 para data
        dadosChamado.setHora(dadosChamado.getDataHora(1)); // 1 para hora

    }

    public void limpaCampos() {

        txtSubCat.setText("");
        txtDescricao.setText("");
    }

    private void btnNovoChamadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoChamadoMousePressed
        setColor(btnNovoChamado);
        resetColor(btnSeusChamados);
        resetColor(btnAvisos);
        resetColor(btnSair);

        frameAvisos.setVisible(false);
        frameUltimosChamados.setVisible(false);
        frameChamado.setVisible(true);


    }//GEN-LAST:event_btnNovoChamadoMousePressed

    private void btnAvisosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAvisosMousePressed
        setColor(btnAvisos);
        resetColor(btnNovoChamado);
        resetColor(btnSeusChamados);
        resetColor(btnSair);

        frameChamado.setVisible(false);
        frameUltimosChamados.setVisible(false);
        frameAvisos.setVisible(true);

        carregaTabelaAvisos();
    }//GEN-LAST:event_btnAvisosMousePressed

    private void btnSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMousePressed
        setColor(btnSair);
        resetColor(btnNovoChamado);
        resetColor(btnSeusChamados);
        resetColor(btnAvisos);

        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Sair", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {

        }

    }//GEN-LAST:event_btnSairMousePressed

    private void btnSeusChamadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSeusChamadosMousePressed
        setColor(btnSeusChamados);
        resetColor(btnNovoChamado);
        resetColor(btnSair);
        resetColor(btnAvisos);

        frameChamado.setVisible(false);
        frameAvisos.setVisible(false);
        frameUltimosChamados.setVisible(true);

        tblUltimosChamados.getColumnModel().getColumn(2).setHeaderValue("Data");
        tblUltimosChamados.getColumnModel().getColumn(5).setHeaderValue("Prazo");
        tblUltimosChamados.getTableHeader().resizeAndRepaint();

        carregaTabelaChamados(0);

    }//GEN-LAST:event_btnSeusChamadosMousePressed

    private void jLabel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MousePressed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Sair", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {

        }
    }//GEN-LAST:event_jLabel16MousePressed

    private void jLabel36MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MousePressed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Sair", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {

        }
    }//GEN-LAST:event_jLabel36MousePressed

    private void jLabel28MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MousePressed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Sair", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {

        }
    }//GEN-LAST:event_jLabel28MousePressed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        gravaChamado();

        try {
            ChamadoDAO.cadastraChamado(dadosChamado, dadosUsuario.getId());
            limpaCampos();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Não foi possível registrar o chamado!!!");
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedIndex() == 0) {

            tblUltimosChamados.getColumnModel().getColumn(2).setHeaderValue("Data");
            tblUltimosChamados.getColumnModel().getColumn(5).setHeaderValue("Prazo");
            tblUltimosChamados.getTableHeader().resizeAndRepaint();

            
            carregaTabelaChamados(0);
        } else if (jComboBox1.getSelectedIndex() == 1) {

            
            carregaTabelaChamados(1);
        } else if (jComboBox1.getSelectedIndex() == 2) {
            
            tblUltimosChamados.getColumnModel().getColumn(2).setHeaderValue("Data Conclusão");
            tblUltimosChamados.getColumnModel().getColumn(5).setHeaderValue("Resolvido por");
            tblUltimosChamados.getTableHeader().resizeAndRepaint();
            jLabel29.setText("Clique em um chamado para ver a solução:");
            
            carregaTabelaChamados(2);
            
            
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaUsuario(LoginView.tmpUsuario).setVisible(true);
            }
        });
    }

    private void setColor(JPanel panel) {
        panel.setBackground(new Color(51, 175, 51));
    }

    private void resetColor(JPanel panel) {
        panel.setBackground(new Color(0, 153, 50));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAvisos;
    private java.awt.Button btnEnviar;
    private javax.swing.JPanel btnNovoChamado;
    private javax.swing.JPanel btnSair;
    private javax.swing.JPanel btnSeusChamados;
    private javax.swing.JInternalFrame frameAvisos;
    private javax.swing.JInternalFrame frameChamado;
    private javax.swing.JInternalFrame frameUltimosChamados;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JComboBox<String> jcbCategoria;
    private javax.swing.JComboBox<String> jcbSetor;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblID11;
    private javax.swing.JLabel lblID8;
    private javax.swing.JLabel lblID88;
    private javax.swing.JLabel lblIDB;
    private javax.swing.JLabel lblIDBB;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JLabel lblUsuario11;
    private javax.swing.JLabel lblUsuario8;
    private javax.swing.JLabel lblUsuario88;
    private javax.swing.JLabel lblUsuarioB;
    private javax.swing.JLabel lblUsuarioBB;
    private javax.swing.JPanel pnlAvisos;
    private javax.swing.JPanel pnlBarra;
    private javax.swing.JPanel pnlBarra3;
    private javax.swing.JPanel pnlBarra4;
    private javax.swing.JPanel pnlChamado;
    private javax.swing.JPanel pnlChamado1;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTable tblAvisos;
    private javax.swing.JTable tblUltimosChamados;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtDescricao2;
    private javax.swing.JTextField txtDescricaoAviso;
    private javax.swing.JTextField txtSubCat;
    // End of variables declaration//GEN-END:variables
}
